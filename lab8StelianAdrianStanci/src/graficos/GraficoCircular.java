package graficos;

import encuesta.Pregunta;

public class GraficoCircular implements Grafico{
	
	@Override
	public void actualizar(Pregunta p) {
		
		int total = p.getVotosNo() + p.getVotosSi();
		double pSi = p.getVotosSi()/ (double) total;
		
		System.out.println("SI: " + pSi*360 + "� NO: " + (1-pSi)*360 + "�");
	}

	@Override
	public void hacerBackup() {
		System.out.println("Aqu� se guardar�an los datos en disco/BD.");
	}

}
