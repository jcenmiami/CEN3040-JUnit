package com.ezitapps;

public class Circle {
	private int radius;
	private double areaCircle;
	
	//Default Constructor
	public Circle(){
		radius = 0;
	}
	//Constructor with radius parameter
	public Circle(int radius){
		this.radius = radius;
	}
	
	
	// Getters and Setters.
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double getAreaCircle() {
		return Math.PI*radius*radius;
	}
	public void calculateCircleArea(){
		areaCircle = Math.PI*radius*radius;
	}
	
	

}
