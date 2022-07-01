package activadores;

import encuesta.Pregunta;
import graficos.Grafico;

public class ActivadorFrecuencia implements Grafico{

	private int frecuencia;
	private int contador=1;
	private Grafico g;
	
	public ActivadorFrecuencia(Grafico g, int frecuencia) {
		this.g = g;
		this.frecuencia = frecuencia;
		this.contador = frecuencia;
	}

	@Override
	public void hacerBackup() {
		if(frecuencia%contador == 0) {
			g.hacerBackup();
		}
	}

	@Override
	public void actualizar(Pregunta p) {
		
		
		if(contador == frecuencia) {
			g.actualizar(p);
			contador = 0;
		}
		
		contador++;
	}
	
	
}
