package acciones;

import java.io.IOException;

import fileSystem.Output;

public class AccionEncriptar implements Output {
    
    private Output o;

	public AccionEncriptar(Output o) {
		this.o = o;
	}

	public void send(char c) throws IOException {
		o.send((char) (Character.isLetterOrDigit(c) ? c + 1 : c));
	}

	public void close() throws IOException {
		o.close();
	}
}