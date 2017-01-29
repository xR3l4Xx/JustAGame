package com.justagame.gamelogic;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public class GameObject {
	
	public vec2 pos;
	public vec2 vel;
	public Rectangle collBox;
	
	public GameObject(){
		
	}
	
	public GameObject(vec2 pos){
		this.pos = pos;
	}
	
	public GameObject(vec2 pos, vec2 vel){
		this.pos = pos;
		this.vel = vel;
	}
	
	public void setCollBox(int width, int height){
		collBox = new Rectangle();
		collBox.setBounds((int)pos.x, (int)pos.y, width, height);
	}

	public vec2 getPos() {
		return pos;
	}

	public void setPos(vec2 pos) {
		this.pos = pos;
		collBox.setLocation((int)pos.x, (int)pos.y);
	}
	
	public void translatePos(vec2 v){
		pos.add(v);
		collBox.setLocation((int)pos.x, (int)pos.y);
	}

	public vec2 getVel() {
		return vel;
	}

	public void setVel(vec2 vel) {
		this.vel = vel;
	}
	
	public void update(float delta){
		translatePos(vel);
	}
	
	//EZT CSAK KIPROBALOM HOGY MUKODIK IGY
	//gameObj.draw(g)
	//ES AKKOR RAJZOL E A RENDERERBEN
	public void draw(Graphics2D g, boolean drawCol){
		g.drawRect((int)pos.x, (int)pos.y, 10,10);
		if(drawCol){
			g.drawRect((int)collBox.getX(), (int)collBox.getY(), 
					(int)collBox.getWidth(), (int)collBox.getHeight());
		}
	}
}
