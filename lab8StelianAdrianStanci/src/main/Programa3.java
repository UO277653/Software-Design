package main;

import java.io.IOException;

import activadores.ActivadorUsos;
import encuesta.Pregunta;
import encuesta.TextUserInterface;
import graficos.GraficoCircular;
import graficos.GraficoLineaEstado;

public class Programa3 {

	public static void main(String[] args) throws IOException {
		Pregunta encuesta = new Pregunta("¿Está a favor de la energia nuclear?");
		
		//encuesta.addGrafico(new GraficoBarras());
		encuesta.addGrafico(new ActivadorUsos(new GraficoCircular(),3));
		encuesta.addGrafico(new GraficoLineaEstado());
		
		TextUserInterface userInterface = new TextUserInterface();
		userInterface.rellena(encuesta);
	}
	
}
