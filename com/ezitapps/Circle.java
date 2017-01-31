package com.ezitapps;


public class Circle {
	private int radius;
	
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
		System.out.println("Area of Circle is: " + (Math.PI*radius*radius));
		return Math.PI*radius*radius;
	}
	
	

}
