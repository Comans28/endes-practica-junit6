package edu.ramirezDaniel.endes;

/**
 * Clase que implementa operaciones aritméticas básicas.
 * Incluye suma, resta, multiplicación y división controlada.
 */
public class Calculadora {

    /**
     * Suma dos números reales.
     * @param a Primer sumando.
     * @param b Segundo sumando.
     * @return La suma de a y b.
     */
    public double sumar(double a, double b) {
        return a + b;
    }

    /**
     * Resta dos números reales.
     * @param a Minuendo.
     * @param b Sustraendo.
     * @return La diferencia entre a y b.
     */
    public double restar(double a, double b) {
        return a - b;
    }

    /**
     * Multiplica dos números reales.
     * @param a Primer factor.
     * @param b Segundo factor.
     * @return El producto de a y b.
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Divide dos números reales.
     * @param a Dividendo.
     * @param b Divisor. No puede ser cero.
     * @return El cociente de la división.
     * @throws IllegalArgumentException Si el divisor es cero.
     */
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("La división entre cero no está permitida.");
        }
        return a / b;
    }
}