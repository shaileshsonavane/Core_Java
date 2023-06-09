package com.demo.test;

import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Student;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;

public class TestStudentHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StudentService ss=new StudentServiceImpl();
		int choice=0;
		do {
			System.out.println("1. Add new Student\n2. Display all\n 3. Disaly by id\n 4. Display by name");
			System.out.println("5. sort by div\n 6. sort by name\n 7. modify div\n 8. delete by id\n 9.exit");
			System.out.println("choice : ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				ss.addNewStudent();
				break;
			case 2:
				ss.displayAllStudent();
				break;
			case 3:
				System.out.println("Enter id");
				int id = sc.nextInt();
				Student s = ss.displaybyID(id);
				if(s!=null) {
					System.out.println(s);
				}else {
					System.out.println("Student not found");
				}
			case 4:
				System.out.println("enetr name");
				String nm=sc.next();
				Set<Student> eset=ss.displayByName(nm);
				if(eset!=null) {
					eset.forEach(a->{System.out.println(a);});
				}
				else {
					System.out.println("not found");
				}
				break;
			case 9:
				sc.close();
				System.out.println("Thank you for visiting ....");
				break;
			default:
				System.out.println("wrong choice");
				break;
			}
			
		}while(choice!=9);

	}

}
