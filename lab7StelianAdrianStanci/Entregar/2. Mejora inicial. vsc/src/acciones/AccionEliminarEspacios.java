package acciones;

import java.io.IOException;

import fileSystem.Output;

public class AccionEliminarEspacios implements Output {
    
    private Output o;
	private char ultimo = 0;

	public AccionEliminarEspacios(Output o) {
		this.o = o;
	}

	public void send(char c) throws IOException {
		if (c==' ' && ultimo==' '){
			return;
        }

		o.send(c);
		ultimo = c;
	}

	public void close() throws IOException {
		o.close();
	}
}
