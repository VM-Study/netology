package ru.netology.patient.service.medical;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import ru.netology.patient.entity.BloodPressure;
import ru.netology.patient.entity.HealthInfo;
import ru.netology.patient.entity.PatientInfo;
import ru.netology.patient.repository.PatientInfoFileRepository;
import ru.netology.patient.service.alert.SendAlertService;
import ru.netology.patient.service.alert.SendAlertServiceImpl;

import java.math.BigDecimal;
import java.time.LocalDate;

class MedicalServiceImplTest {
    private PatientInfoFileRepository patientInfoRepository;
    private MedicalService medicalService;
    private SendAlertService alertService;
    private String id = "ca82e932-6413-48c1-96c3-6c0c7753faa2";

    @BeforeEach
    public void initSuite() {
        patientInfoRepository = Mockito.mock(PatientInfoFileRepository.class);
        Mockito.when(patientInfoRepository.getById(id))
                .thenReturn(new PatientInfo(id, "Иван", "Петров", LocalDate.of(1980, 11, 26),
                        new HealthInfo(new BigDecimal("36.65"), new BloodPressure(120, 80))));
        alertService = Mockito.spy(SendAlertServiceImpl.class);
        medicalService = new MedicalServiceImpl(patientInfoRepository, alertService);
    }

    @Test
    void testCheckBloodPressure_checkHigh() {
        // given:
        final String original = "Warning, patient with id: " + id + ", need help";
        BloodPressure currentPressure = new BloodPressure(60, 120);
        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);
        medicalService.checkBloodPressure(id, currentPressure);

        // when:
        Mockito.verify(alertService).send(argumentCaptor.capture());

        // then:
        Assertions.assertEquals(original, argumentCaptor.getValue());
    }

    @Test
    void testCheckTemperature_checkLow() {
        // given:
        final String original = "Warning, patient with id: " + id + ", need help";
        BigDecimal currentTemperature = new BigDecimal("34.9");
        medicalService.checkTemperature(id, currentTemperature);
        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);

        // when:
        Mockito.verify(alertService).send(argumentCaptor.capture());

        // then:
        Assertions.assertEquals(original, argumentCaptor.getValue());
    }

    @Test
    void testCheckTemperatureAndBloodPressure_checkNoAlert() {
        // given:
        BloodPressure currentPressure = new BloodPressure(120, 80);
        BigDecimal currentTemperature = new BigDecimal("36.65");

        // when:
        medicalService.checkBloodPressure(id, currentPressure);
        medicalService.checkTemperature(id, currentTemperature);

        // then:
        Mockito.verify(alertService, Mockito.never()).send(Mockito.any());
    }
}