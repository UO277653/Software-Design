/**
 * # IMPORTANTE: El código entregado para esta práctica es el mínimo necesario para entender
 * el ejercicio y NUNCA debería ser tomado como un ejemplo del uso adecuado de excepciones,
 * asertos y tests. Todo lo anterior, que debería hacerse en un programa real, se ha omitido
 * a propósito para simplificar el planteamiento del ejercicio.
 */

package main;

import formulario.*;
import validaciones.*;

public class Main {

    public static void main(String[] args) {
        Formulario formulario = new Formulario();

        formulario.addCampo(new Campo("Nombre", new CheckText()));
        formulario.addCampo(new Campo("Apellido", new CheckText()));
        formulario.addCampo(new Campo("Teléfono", new CheckNumber()));
        formulario.addCampo(new Campo("Ciudad", new CheckValues("Santander", "Oviedo", "Cádiz")));

        formulario.PideDatos();
    }
}
