package edu.ramirezDaniel.endes;

/**
 * Clase que realiza conversiones entre escalas de temperatura.
 * Implementa las fórmulas habituales de conversión.
 */
public class ConversorTemperatura {

    /**
     * Convierte una temperatura de Celsius a Fahrenheit.
     * Fórmula: (Celsius * 9/5) + 32
     * @param celsius Temperatura en grados Celsius.
     * @return Equivalente en grados Fahrenheit.
     */
    public double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Convierte una temperatura de Fahrenheit a Celsius.
     * Fórmula: (Fahrenheit - 32) * 5/9
     * @param fahrenheit Temperatura en grados Fahrenheit.
     * @return Equivalente en grados Celsius.
     */
    public double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}