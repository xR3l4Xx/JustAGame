package com.justagame.gamelogic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainGame {
	public static final int WIDTH = 720;
	public static final int HEIGHT = 480;
	public static long prevTick;
	public static boolean gameIsGoing = true;
	public static int FPS;
	
	public static BufferedImage currentFrame;
	
	public static JFrame frame;
	
	//THIS IS THE PANEL THAT DRAWS THE CURRENT FRAME
	public static JPanel panel = new JPanel(){
		@Override
		public void paint(Graphics g){
			//DRAW FRAME
			g.drawImage(currentFrame, 0, 0, null);
			
			//DRAW FPS
			g.setColor(Color.WHITE);
			g.drawString(Integer.toString(FPS), 10, 20);
		}
	};
	
	public static void main(String[] args){
		//SET UP FRAME
		frame = new JFrame("Jatek");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
		
		//ADD PANEL TO FRAME
		frame.add(panel);
		
		//GAME LOOP
		prevTick = System.currentTimeMillis();
		while(gameIsGoing){
			long delta = System.currentTimeMillis() - prevTick;
			if(delta >= 1000 / 60){ // Ca. 60 fps
				prevTick = System.currentTimeMillis();
				currentFrame = Renderer.renderFrame();
				panel.repaint();
				FPS = (int) (1000 / delta);
			}
		}
	}
}
