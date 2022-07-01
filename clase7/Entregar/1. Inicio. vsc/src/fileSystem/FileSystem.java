package fileSystem;

import java.io.*;

public class FileSystem {

    public void copyFile(String name, String newName) throws IOException {
        FileWriter writer = new FileWriter(newName);

        try {
            FileReader reader = new FileReader(name);

            int c;
            while ((c = reader.read()) != -1)
                writer.append((char) c);

            reader.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendToInternet(String name, String url) {
        try {
            StringWriter stringWriter = new StringWriter();
            stringWriter.append("\n--- START. Conectando a Internet[" + url + "]\n");

            FileReader reader = new FileReader(name);

            int c;
            while ((c = reader.read()) != -1)
                stringWriter.append((char) c);

            reader.close();

            System.out.print(stringWriter.toString());
            System.out.println("--- END. Cerrando conexión a Internet");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendWithBluetooth(String name, String device) {
        try {
            StringWriter stringWriter = new StringWriter();
            stringWriter.append("\n--- START. Conectando con Bluetooth[" + device + "]\n");

            FileReader reader = new FileReader(name);

            int c;
            while ((c = reader.read()) != -1)
                stringWriter.append((char) c);

            reader.close();

            System.out.print(stringWriter.toString());
            System.out.println("--- END. Cerrando conexión Bluetooth");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
