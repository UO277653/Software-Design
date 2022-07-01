package game;

import java.awt.Point;

import platform.*;
import platform.playstation.Playstation5API;

public class Playstation5BallGame extends BallGame 
{
	private Playstation5API playstation = new Playstation5API();

	@Override
	public Image2D loadImage(String filename) 
	{
		return playstation.loadGraphics(filename);
	}

	@Override
	public Point getPosition() 
	{
		return playstation.getJoystick();
	}

	@Override
	public void drawBall(Image2D image, Point point) 
	{
		playstation.render(point.x, point.y, image);
	}
}
