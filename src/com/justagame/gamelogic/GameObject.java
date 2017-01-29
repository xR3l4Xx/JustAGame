package com.justagame.gamelogic;

public class GameObject {
	
	public vec2 pos;
	public vec2 vel;
	
	public GameObject(){
		
	}
	
	public GameObject(vec2 pos){
		this.pos = pos;
	}
	
	public GameObject(vec2 pos, vec2 vel){
		this.pos = pos;
		this.vel = vel;
	}

	public vec2 getPos() {
		return pos;
	}

	public void setPos(vec2 pos) {
		this.pos = pos;
	}

	public vec2 getVel() {
		return vel;
	}

	public void setVel(vec2 vel) {
		this.vel = vel;
	}
	
	
}
