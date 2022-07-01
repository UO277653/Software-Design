package acciones;

import java.io.IOException;

import fileSystem.Output;

public class AccionContar implements Output {
    
    private Output o;
	private int c;

	public AccionContar(Output o) {
		this.o = o;
	}

	public void send(char c) throws IOException {
		o.send(c);
		c++;
	}

	public int getCounter() {
		return c;
	}

	public void close() throws IOException {
		o.close();
	}

}
