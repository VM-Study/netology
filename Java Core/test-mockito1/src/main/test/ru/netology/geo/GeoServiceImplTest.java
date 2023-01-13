package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GeoServiceImplTest {
    private GeoService geoService;

    @BeforeEach
    public void initSuite() {
        geoService = new GeoServiceImpl();
    }

    @Test
    void testByIp_checkMoscow() {
        // given:
        final String original = "Moscow";

        // when:
        final String result = geoService.byIp("172.1.1.1").getCity();

        // then:
        Assertions.assertEquals(original, result);
    }

    @Test
    void testByIp_checkNY() {
        // given:
        final String original = "New York";

        // when:
        final String result = geoService.byIp("96.1.1.1").getCity();

        // then:
        Assertions.assertEquals(original, result);
    }

    @Test
    void testByCoordinates_notSupport() {
        // arrange
        var expected = RuntimeException.class;

        // assert
        Assertions.assertThrows(expected,
                // act
                () -> geoService.byCoordinates(453.125, 144.845));
    }
}