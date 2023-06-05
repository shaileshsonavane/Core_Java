package com.demo.beans;

public class Rectangle extends Shape{
    private int base;
    private int height;
	public Rectangle() {
		super();
		this.base=0;
		this.height=0;
	}
	public Rectangle(String color,String id,int base,int height) {
		super(color,id);
		this.base=base;
		this.height=height;
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
	@Override
	public String toString() {
		return "Shape Rectangle :=>"+super.toString()+" Base = " + base + ", Height = " + height;
	}
	@Override
	public float calArea() {
		
		return (base*height);
	}
	@Override
	public float calPeri() {
		
		return 2*(base+height);
	}

}
