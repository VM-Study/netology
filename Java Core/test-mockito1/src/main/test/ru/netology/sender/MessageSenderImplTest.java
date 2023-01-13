package ru.netology.sender;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;
import ru.netology.i18n.LocalizationService;
import ru.netology.i18n.LocalizationServiceImpl;

import java.util.HashMap;
import java.util.Map;

class MessageSenderImplTest {

    @Test
     void testMessageSenderImplTest_russianTextForRussia() {
        // given:
        GeoService geoService = Mockito.mock(GeoServiceImpl.class);
        Mockito.when(geoService.byIp("172.0.32.1"))
                .thenReturn(new Location("Ekaterinburg", Country.RUSSIA, "Pushkina", 20));

        LocalizationService localizationService = Mockito.mock(LocalizationServiceImpl.class);
        Mockito.when(localizationService.locale(Country.RUSSIA))
                .thenReturn("Добро пожаловать");

        MessageSender messageSender = new MessageSenderImpl(geoService, localizationService);
        Map<String, String> headers = new HashMap<>();
        headers.put(MessageSenderImpl.IP_ADDRESS_HEADER, "172.0.32.1");

        final String original = "Добро пожаловать";

        // when:
        final String result = messageSender.send(headers);

        // then:
        Assertions.assertEquals(original, result);
    }


    @Test
    void testMessageSenderImplTest_englishTextForUSA() {
        // given:
        GeoService geoService = Mockito.mock(GeoServiceImpl.class);
        Mockito.when(geoService.byIp("96.44.0.1"))
                .thenReturn(new Location("Miami", Country.USA, "Collins", 2510));

        LocalizationService localizationService = Mockito.mock(LocalizationServiceImpl.class);
        Mockito.when(localizationService.locale(Country.USA))
                .thenReturn("Welcome");

        MessageSender messageSender = new MessageSenderImpl(geoService, localizationService);
        Map<String, String> headers = new HashMap<>();
        headers.put(MessageSenderImpl.IP_ADDRESS_HEADER, "96.44.0.1");

        final String original = "Welcome";

        // when:
        final String result = messageSender.send(headers);

        // then:
        Assertions.assertEquals(original, result);
    }

}