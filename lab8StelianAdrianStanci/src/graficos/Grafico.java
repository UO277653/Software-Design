package graficos;

import encuesta.Pregunta;

public interface Grafico {
	
	public void hacerBackup();
	
	public void actualizar(Pregunta p);
}
