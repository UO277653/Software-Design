package acciones;

import java.io.IOException;

import fileSystem.Output;

public class AccionRepartir implements Output {
    
    private Output o1, o2;

	public AccionRepartir(Output o1, Output o2) {
		this.o1 = o1;
		this.o2 = o2;
	}

	public void send(char c) throws IOException {
		o1.send(c);
		o2.send(c);
	}

	public void close() throws IOException {
		o1.close();
		o2.close();
	}
}
