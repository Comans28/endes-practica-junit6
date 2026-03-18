package edu.ramirezDaniel.endes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

/**
 * Pruebas unitarias para ValidadorPassword.
 */
class ValidadorPasswordTest {
    private ValidadorPassword validador;

    @BeforeEach
    void setUp() {
        validador = new ValidadorPassword();
    }

    @Test
    void testPasswordSegura() {
        // Caso de éxito: tiene longitud, mayúscula y número
        assertTrue(validador.esSegura("Password123"), "Debería ser válida");
    }

    @Test
    void testPasswordCorta() {
        // Caso de error: menos de 8 caracteres
        assertFalse(validador.esSegura("Pass1"), "Debería ser falsa por ser corta");
    }

    @Test
    void testPasswordSinNumero() {
        // Caso de error: sin números
        assertFalse(validador.esSegura("SoloLetras"), "Debería ser falsa por no tener números");
    }

    @Test
    void testPasswordNula() {
        // Comprobación de valores nulos [cite: 53]
        assertFalse(validador.esSegura(null), "Debería ser falsa si es null");
    }
}