package com.justagame.gamelogic;

public class vec2 {
	public float x,y;
	
	public vec2(float x, float y){
		this.x = x;
		this.y = y;
	}
	
	public void add(vec2 v){
		this.x += v.x;
		this.y += v.y;
	}
	
	public void normalize(){
		float mag = (float) Math.sqrt(x * x + y * y);
		
		this.x = this.x / mag;
		this.y = this.y / mag;
	}
	
	public void mult(float f){
		this.x *= f;
		this.y *= f;
	}
	
	//RADIAN
	public vec2 getDir(vec2 v){
		return new vec2(v.x - this.x, v.y - this.y);
	}
	
	public void Log(){
		System.out.println((int) this.x + " " + (int) this.y);
	}
}
