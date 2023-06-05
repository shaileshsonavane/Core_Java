package com.demo.beans;

public class Circle extends Shape{
   private int radius;
	public Circle() {
		super();
		radius=0;
	}
	
	public Circle(String color,String id,int radius) {
		super(color,id);
		this.radius=radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Shape Circle :=> "+super.toString()+" Radius = " + radius;
	}

	@Override
	public float calArea() {
		
		return (float)Math.PI*radius*radius;
	}

	@Override
	public float calPeri() {
		
		return (float)Math.PI*radius*2;
	}
	

}
