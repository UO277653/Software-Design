/**
 * # IMPORTANTE: El código entregado para esta práctica es el mínimo necesario para entender
 * el ejercicio y NUNCA debería ser tomado como un ejemplo del uso adecuado de excepciones,
 * asertos y tests. Todo lo anterior, que debería hacerse en un programa real, se ha omitido
 * a propósito para simplificar el planteamiento del ejercicio.
 */

package main;

import validaciones.*;
import validaciones.composite.*;
import formulario.*;

public class Main {

    public static void main(String[] args) {
        Formulario formulario = new Formulario();

        formulario.addCampo(new Campo("Nombre", new CheckText()));
        formulario.addCampo(new Campo("Apellido", new CheckText()));
        formulario.addCampo(new Campo("Teléfono", new CheckNumber()));
        formulario.addCampo(new Campo("Ciudad", new CheckValues("Santander", "Oviedo", "Cadiz")));

        // "Código de Producto". Longitud = 4
        formulario.addCampo(new Campo("Código de Producto", new CheckLength(4)));

        // "Código Postal". Dígitos y longitud = 5
        formulario.addCampo(new Campo("Código Postal", new CheckAll(new CheckNumber(), new CheckLength(5))));
        formulario.addCampo(new Campo("Código Postal", new CheckCodigoPostal()));

        // "Edad". Dígitos y mayor de 18
        formulario.addCampo(new Campo("Edad", new CheckAll(new CheckNumber(), new CheckGreater(18))));

        // "Sueldo". Dígitos y mayor que 800 y menor que 1200
        formulario.addCampo(
                new Campo("Sueldo", new CheckAll(new CheckNumber(), new CheckGreater(800), new CheckLess(1200))));

        // "Ubicación". "Santander\Oviedo\Cádiz" o Código Postal (ver arriba)
        formulario.addCampo(new Campo("Ubicación",
                new CheckAny(new CheckValues("Santander", "Oviedo", "Cádiz"), new CheckCodigoPostal())));

        // "Código de Promoción". Texto o (número de 3 digitos)
        formulario.addCampo(new Campo("Promoción",
                new CheckAny(new CheckText(), new CheckAll(new CheckNumber(), new CheckLength(3)))));

        formulario.PideDatos();
    }

}
