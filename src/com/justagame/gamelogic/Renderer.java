package com.justagame.gamelogic;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Renderer {
	public static BufferedImage renderFrame(){
		BufferedImage finalImg = new BufferedImage(MainGame.WIDTH, MainGame.HEIGHT, BufferedImage.TYPE_INT_ARGB);
		
		Graphics2D g = finalImg.createGraphics();

		//HERE IS WHAT WE DRAW ON THE IMAGE (FRAME)
		g.setColor(Color.red);
		g.fillRect(0, 0, MainGame.WIDTH, MainGame.WIDTH);
		
		g.dispose();
		
		return finalImg;
	}
}
