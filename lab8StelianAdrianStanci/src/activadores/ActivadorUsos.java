package activadores;

import encuesta.Pregunta;
import graficos.Grafico;

public class ActivadorUsos implements Grafico{

	private int usos;
	private Grafico g;
	private int contador;
	
	public ActivadorUsos(Grafico g, int usos) {
		this.g = g;
		this.usos = usos;
	}

	@Override
	public void hacerBackup() {
		if(contador >= usos) {
			g.hacerBackup();
		}
	}

	@Override
	public void actualizar(Pregunta p) {
		contador++;
		if(contador >= usos) {
			g.actualizar(p);
		}
	}
}
