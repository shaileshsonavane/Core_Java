package com.demo.service;
import java.util.Scanner;
import com.demo.beans.Circle;
import com.demo.beans.Rectangle;
import com.demo.beans.Triangle;
import com.demo.beans.Shape;
public class ShapeService {
 private static Shape[] sarr;
 private static int index;
 static {
	 sarr=new Shape[10];
	 index=0;
 }

	public static void addNewShape() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Rectangle\n2.Circle\n3.Triangle");
		int ch = sc.nextInt();
		if(ch>3 || ch<0) {
			System.out.println("Invalid Choice !!!");
			return;
		}
		System.out.println("Enter Color :");
		String color = sc.next();
		switch(ch) {
		case 1:
			System.out.println("Enter Base :");
			int base = sc.nextInt();
			System.out.println("Enter Height : ");
			int height = sc.nextInt();
			sarr[index]=new Rectangle(color,"RECT-"+(index+1),base,height);
			index++;
			break;
		case 2:
			System.out.println("Enter Radius : ");
			int radius = sc.nextInt();
			sarr[index]=new Circle(color,"CIRL-"+(index+1),radius);
			index++;
			break;
		case 3:
			System.out.println("Enter Base :");
			base = sc.nextInt();
			System.out.println("Enter Height : ");
			height = sc.nextInt();
			System.out.println("Enter Side 1");
			int side1 = sc.nextInt();
			System.out.println("Enter Side 2");
			int side2 = sc.nextInt();
			sarr[index]=new Triangle(color,"TRIN-"+(index+1),base,height,side1,side2);
			index++;
			break;
		}
		
		
	}

	public static void displayAllShapes() {
		if(sarr[0]==null) {
			System.out.println("No shapes available..");
			return;
		}
		for(int i=0;i<index;i++) {
			System.out.println(sarr[i]);
		}
		
	}
    private static int getIndex(String id) {
    	for(int i=0;i<index;i++) {
    		if(sarr[i].getId().equals(id)) {
    			return i;
    		}
    	}
    	return -1;
    }
	public static void displayById() {
		System.out.println("Enter ID of Shape...");
		Scanner sc = new Scanner(System.in);
		String ID = sc.next();
		int index = getIndex(ID);
		if(index!=-1) {
			System.out.println(sarr[index]);
		}
		else {
			System.out.println("ID not Found !!!");
		}
		
		
	}

	public static void calDetails() {
		System.out.println("Enter ID of Shape...");
		Scanner sc = new Scanner(System.in);
		String ID = sc.next();
		int index = getIndex(ID);
		if(index!=-1) {
			float area = sarr[index].calArea();
			float peri = sarr[index].calPeri();
			System.out.println("ID : "+ID+"\nArea : "+area+"\nPerimter : "+peri);
		}
		else {
			System.out.println("ID not Found !!!");
		}
		
		
	}

	public static void checkNumbers() {
		if(sarr[0]==null) {
			System.out.println("No shapes available..");
			return;
		}
		int rect=0,circ=0,tri=0;
		for(int i=0;i<index;i++) {
			if(sarr[i] instanceof Rectangle) {
				rect++;
			}
			else if(sarr[i] instanceof Triangle) {
				tri++;
			}
			else {
				circ++;
			}
		}
		System.out.println("Nuber of Shapes : \n1.Rectangle : "+rect+"\n2.Triangle : "+tri+"\n3.Circle : "+circ);
	}

}
