package main;

import game.*;

public class Main 
{
	public static void main(String[] args) 
	{
		BallGame game = new AndroidBallGame();
		game.play();
	}
}
