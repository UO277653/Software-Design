package encuesta;

import java.util.ArrayList;
import java.util.List;

import graficos.Grafico;

public class Pregunta {

	private int si, no;
	private String pregunta;
	
	private List<Grafico> graficos;

	public Pregunta(String pregunta) {
		this.pregunta = pregunta;
		graficos = new ArrayList<Grafico>();
	}
	
	public void addGrafico(Grafico g) {
		graficos.add(g);
	}
	
	public void removeGrafico(Grafico g) {
		graficos.remove(g);
	}

	public String getPregunta() {
		return pregunta;
	}

	public int getVotosSi() {
		return si;
	}

	public int getVotosNo() {
		return no;
	}

	public void incrementaSi() {
		si++;
		actualizar();
	}

	public void incrementaNo() {
		no++;
		actualizar();
	}
	
	public void actualizar() {
		for(Grafico g: graficos) {
			g.actualizar(this);
			g.hacerBackup();
		}
	}


	// Parte de representar los datos
	// esto no puede estar en pregunta
//	private void actualizaGráficoCircular() {
//		System.out.println("Aquí se dibujaría el gráfico circular.");
//	}
//
//	private void actualizaGráficoBarras() {
//		System.out.println("Aquí se dibujaría el gráfico de barras.");
//	}
//
//	private void hacerBackup() {
//		System.out.println("Aquí se guardarían los datos en disco/BD.");
//	}

}
