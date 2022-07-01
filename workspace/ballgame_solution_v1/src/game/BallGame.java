package game;

import java.awt.Point;

import platform.*;

/* Esta clase (y todo el código que hubiera dentro de este paquete) sería el
 * código del videojuego completo, y es lo que se desea reutilizar en las distintas
 * plataformas.
 */

public class BallGame 
{
	// Decide para qué plataform queremos generar el juego
	private Platform platform;
	
	public BallGame(Platform platform)
	{
		this.platform = platform;
	}
	
	public void play() 
	{
		Image2D image = platform.loadImage("ball.png");

		// lógica principal del juego
		for (int i = 0; i < 10; i++) {
			Point point = platform.getPosition();
			platform.drawBall(image, point);
		}
	}
}
