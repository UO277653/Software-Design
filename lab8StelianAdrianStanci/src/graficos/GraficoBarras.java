package graficos;

import encuesta.Pregunta;

public class GraficoBarras implements Grafico{

	@Override
	public void actualizar(Pregunta p) {
		String res = "SI:";
		
		int si = p.getVotosSi();
		int no = p.getVotosNo();
		
		for(int i = 0; i < si; i++) {
			res += "X";
		}
		
		res += "\nNO:";
		
		for(int i = 0; i < no; i++) {
			res += "X";
		}
		
		System.out.println(res);
	}

	@Override
	public void hacerBackup() {
		System.out.println("Aquí se guardarían los datos en disco/BD.");
	}

}
