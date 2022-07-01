package graficos;

import encuesta.Pregunta;

public class GraficoLineaEstado implements Grafico{

	@Override
	public void hacerBackup() {
		System.out.println("Aquí se guardarían los datos en disco/BD.");
	}

	@Override
	public void actualizar(Pregunta p) {

		System.out.println("Nº votos sí: " + p.getVotosSi() + " Nº votos no: " + p.getVotosNo());
	}

}
