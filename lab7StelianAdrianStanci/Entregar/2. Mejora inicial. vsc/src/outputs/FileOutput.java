package outputs;
import java.io.*;

import fileSystem.Output;

public class FileOutput implements Output {

	//boolean aEncriptar
	// clase sender que se ocupe de eso?
	public FileOutput(String fileName) throws IOException {
		file = new FileWriter(fileName);
	}

	public void send(char c) throws IOException {
		file.append(c);
	}

	public void close() throws IOException {
			file.close();
	}

	private FileWriter file;
}
