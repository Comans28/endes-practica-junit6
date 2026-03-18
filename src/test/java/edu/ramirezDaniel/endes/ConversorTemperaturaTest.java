package edu.ramirezDaniel.endes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

/**
 * Pruebas unitarias para la clase ConversorTemperatura.
 */
class ConversorTemperaturaTest {
    private ConversorTemperatura conversor;

    @BeforeEach
    void setUp() {
        conversor = new ConversorTemperatura();
    }

    @Test
    void testCelsiusAFahrenheit() {
        // 0°C debe ser 32°F
        assertEquals(32.0, conversor.celsiusAFahrenheit(0), 0.001);
        // 100°C debe ser 212°F
        assertEquals(212.0, conversor.celsiusAFahrenheit(100), 0.001);
    }

    @Test
    void testFahrenheitACelsius() {
        // 32°F debe ser 0°C
        assertEquals(0.0, conversor.fahrenheitACelsius(32), 0.001);
        // 212°F debe ser 100°C
        assertEquals(100.0, conversor.fahrenheitACelsius(212), 0.001);
    }
}