package com.demo.beans;

public abstract class Shape {
 private static int count;
 private String color;
 private String id;
 static {
	 count=0;
 }
 public Shape() {
		super();
		this.color =null;
		this.id = null;
	}
	 
public Shape(String color, String id) {
	super();
	this.color = color;
	this.id = id;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public abstract float calArea();
public abstract float calPeri();
@Override
public String toString() {
	return "Color = " + color + ", ID = " + id;
}
 
 
}
