package com.demo.beans;

public class Triangle extends Shape {
    private int base,height,side1,side2;
	public Triangle() {
		super();
		this.base=0;
		this.height=0;
		this.side1=0;
		this.side2=0;
	}
	public Triangle(String color,String id,int base,int height,int side1,int side2) {
		super();
		this.base=base;
		this.height=height;
		this.side1=side1;
		this.side2=side2;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getSide1() {
		return side1;
	}
	public void setSide1(int side1) {
		this.side1 = side1;
	}
	public int getSide2() {
		return side2;
	}
	public void setSide2(int side2) {
		this.side2 = side2;
	}
	@Override
	public String toString() {
		return "Shape Triangle:=>"+super.toString()+" Base = " + base + ", Height = " + height + ", Side1 = " + side1 + ", Side2 = " + side2;
	}
	@Override
	public float calArea() {
	
		return (float)0.5*base*height;
	}
	@Override
	public float calPeri() {
		
		return (base+side1+side2);
	}

}
