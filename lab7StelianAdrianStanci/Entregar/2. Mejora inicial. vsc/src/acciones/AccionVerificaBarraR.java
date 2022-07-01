package acciones;

import java.io.IOException;

import fileSystem.Output;

public class AccionVerificaBarraR implements Output {
    
    private Output o;

	public AccionVerificaBarraR(Output o) {
		this.o = o;
	}

	public void send(char c) throws IOException {
		if (c!='\r'){
			o.send(c);
        }
	}

	public void close() throws IOException {
		o.close();
	}
}