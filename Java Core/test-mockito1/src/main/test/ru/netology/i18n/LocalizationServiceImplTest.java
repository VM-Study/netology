package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

class LocalizationServiceImplTest {

    private LocalizationService localizationService ;

    @BeforeEach
    public void initSuite() {
        localizationService = new LocalizationServiceImpl();
    }

    @Test
    void testLocale_checkRU() {
        // given:
        final String original = "Добро пожаловать";

        // when:
        final String result = localizationService.locale(Country.RUSSIA);

        // then:
        Assertions.assertEquals(original, result);
    }

    @Test
    void testLocale_checkEN() {
        // given:
        final String original = "Welcome";

        // when:
        final String result = localizationService.locale(Country.BRAZIL);

        // then:
        Assertions.assertEquals(original, result);
    }
}