package com.demo.test;
import java.util.Scanner;

import com.demo.service.ShapeService;
public class Test {

	

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int choice=0; 
	  do {
		  System.out.println("\n1.Add Shape\n2.Display All Shpes\n3.Search Shape by ID\n4.Cal Area & Perimter\n5.Check Numbers\n6.Exit\nEnter Choice...");
		  choice = sc.nextInt();
		  switch(choice) {
		  case 1:
			  ShapeService.addNewShape();
			  break;
		  case 2:
			  ShapeService.displayAllShapes();
			  break;
		  case 3:
			  ShapeService.displayById();
			  break;
		  case 4:
			  ShapeService.calDetails();
			  break;
		  case 5:
			  ShapeService.checkNumbers();
			  break;
		  case 6:
			  System.out.println("Thank You !!!");
			  sc.close();
			  break;
		  }
		 
	  }while(choice!=6);

	}

}
