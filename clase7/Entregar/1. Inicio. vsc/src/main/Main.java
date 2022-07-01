/**
 * # IMPORTANTE: El código entregado para esta práctica es el mínimo necesario para entender
 * el ejercicio y NUNCA debería ser tomado como un ejemplo del uso adecuado de excepciones,
 * asertos y tests. Todo lo anterior, que debería hacerse en un programa real, se ha omitido
 * a propósito para simplificar el planteamiento del ejercicio.
 */

package main;

import java.io.*;

import fileSystem.FileSystem;

public class Main {

    public static void main(String[] args) throws IOException {
        FileSystem fs = new FileSystem();
        System.out.println("Hola");
        fs.copyFile("privado.txt", "copia.txt");
        fs.sendToInternet("privado.txt", "156.17.11.196");
        fs.sendWithBluetooth("privado.txt", "Galaxy de Raúl");
    }
}
