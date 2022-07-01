package main;
import java.io.IOException;

import encuesta.Pregunta;
import encuesta.TextUserInterface;
import graficos.GraficoBarras;

public class Main {

	public static void main(String[] args) throws IOException {
		Pregunta encuesta = new Pregunta("¿Está a favor de la energia nuclear?");

		encuesta.addGrafico(new GraficoBarras());
		
		TextUserInterface userInterface = new TextUserInterface();
		userInterface.rellena(encuesta);
	}

}

