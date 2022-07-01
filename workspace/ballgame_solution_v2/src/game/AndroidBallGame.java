package game;

import java.awt.Point;

import platform.Image2D;
import platform.android.AndroidAPI;

public class AndroidBallGame extends BallGame 
{
	private AndroidAPI android = new AndroidAPI();

	@Override
	public Image2D loadImage(String filename) 
	{
		return android.loadResource(filename);
	}

	@Override
	public Point getPosition() 
	{
		return android.getTouch();
	}

	@Override
	public void drawBall(Image2D image, Point point) 
	{
		android.draw(point.x, point.y, image);
	}
}
