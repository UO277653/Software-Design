package platform.adapters;

import java.awt.Point;

import platform.*;
import platform.android.AndroidAPI;

public class AndroidPlatform implements Platform 
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
