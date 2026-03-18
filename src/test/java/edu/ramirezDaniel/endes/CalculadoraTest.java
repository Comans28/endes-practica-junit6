package edu.ramirezDaniel.endes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

/**
 * Pruebas unitarias para la clase Calculadora.
 */
public class CalculadoraTest {
    private Calculadora calc;

    @BeforeEach
    void setUp() {
        calc = new Calculadora();
    }

    @Test
    void testSuma() {
        // Verifica que 7 + 3 sea 10
        assertEquals(10.0, calc.sumar(7.0, 3.0), "La suma debe ser 10");
    }

    @Test
    void testResta() {
        // Verifica que 10 - 6 sea 4
        assertEquals(4.0, calc.restar(10.0, 6.0), "La resta debe ser 4");
    }

    @Test
    void testMultiplicacion() {
        // Verifica que 3 * 5 sea 15
        assertEquals(15.0, calc.multiplicar(3.0, 5.0), "La multiplicación debe ser 15");
    }

    @Test
    void testDivision() {
        // Verifica una división exacta
        assertEquals(2.0, calc.dividir(10.0, 5.0), "10 / 5 debe ser 2");
    }

    @Test
    void testDivisionPorCero() {
        // Verifica que lance la excepción obligatoria
        assertThrows(IllegalArgumentException.class, () -> {
            calc.dividir(10.0, 0);
        }, "Debe lanzar error al dividir por cero");
    }
}