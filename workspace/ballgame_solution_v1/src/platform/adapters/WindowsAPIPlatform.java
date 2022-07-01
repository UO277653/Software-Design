package platform.adapters;

import java.awt.Point;

import platform.*;
import platform.windows.WindowsAPI;

public class WindowsAPIPlatform implements Platform 
{
	private WindowsAPI windows = new WindowsAPI();

	@Override
	public Image2D loadImage(String filename) 
	{
		return windows.loadFile(filename);
	}

	@Override
	public Point getPosition() 
	{
		return windows.getMouseClick();
	}

	@Override
	public void drawBall(Image2D image, Point point) 
	{
		windows.paint(point.x, point.y, image);
	}
}
