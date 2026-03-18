package edu.ramirezDaniel.endes;

/**
 * Clase que valida si una contraseña cumple con requisitos de seguridad.
 * Requisitos: Longitud mínima de 8, una mayúscula y un número. [cite: 53]
 */
public class ValidadorPassword {

    /**
     * Valida la contraseña proporcionada.
     * @param password La cadena a validar.
     * @return true si cumple los requisitos, false si es nula o no los cumple. [cite: 53]
     */
    public boolean esSegura(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }
        // Expresión regular: contiene al menos una mayúscula y un número
        String regex = "^(?=.*[A-Z])(?=.*[0-9]).+$";
        return password.matches(regex);
    }
}