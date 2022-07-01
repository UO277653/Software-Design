package graficos;

import encuesta.Pregunta;

public class GraficoLineaEstado implements Grafico{

	@Override
	public void hacerBackup() {
		System.out.println("Aqu� se guardar�an los datos en disco/BD.");
	}

	@Override
	public void actualizar(Pregunta p) {

		System.out.println("N� votos s�: " + p.getVotosSi() + " N� votos no: " + p.getVotosNo());
	}

}
