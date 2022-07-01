/**
 * # IMPORTANTE: El código entregado para esta práctica es el mínimo necesario para entender
 * el ejercicio y NUNCA debería ser tomado como un ejemplo del uso adecuado de excepciones,
 * asertos y tests. Todo lo anterior, que debería hacerse en un programa real, se ha omitido
 * a propósito para simplificar el planteamiento del ejercicio.
 */

package main;

import java.io.*;
import java.util.*;

import loader.ConfigurableLoader;
import vm.*;

public class Main {

    public static void main(String[] args) throws Exception {
        ConfigurableLoader loader = new ConfigurableLoader("src/config.txt");
        List<Instruction> program = loader.loadProgram(new FileReader("programa.txt"));

        VirtualMachine vm = new VirtualMachine(program);
        vm.run();
    }

}
