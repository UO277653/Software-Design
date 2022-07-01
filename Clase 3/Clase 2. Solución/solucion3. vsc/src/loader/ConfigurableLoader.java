package loader;

import java.io.*;

public class ConfigurableLoader extends AdvancedProgramLoader {

    public ConfigurableLoader(String configurationFile) throws Exception {
        BufferedReader fichero = new BufferedReader(new FileReader(configurationFile));

        String linea;
        while ((linea = fichero.readLine()) != null) {
            String[] words = linea.split(":");

            Class<? extends InstructionCreator> c = Class.forName(words[1]).asSubclass(InstructionCreator.class);
            registerLoader(words[0], c.newInstance());

            /**
             * Lo anterior es equivalente a:
             *      Class c = Class.forName(words[1]);
             *      registerLoader(words[0], (InstructionCreator) c.newInstance());
             * Lo que pasa es que esto generar warnings.
             */
        }
        fichero.close();
    }
}
