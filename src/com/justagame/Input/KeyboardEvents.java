package com.justagame.Input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardEvents implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == 65){
			//A
		}
		if(e.getKeyCode() == 83){
			//S
		}
		if(e.getKeyCode() == 68){
			//D
		}
		if(e.getKeyCode() == 87){
			//W
		}
		if(e.getKeyCode() == 32){
			//SPACE
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
