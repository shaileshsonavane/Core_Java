package com.demo.Test;
import java.util.Scanner;
import java.util.List;

import com.demo.Service.StudentService;
import com.demo.Service.StudentServiceIMP;
import com.demo.beans.Student;
public class StudentTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				int choice=0;
		do {
			
			 StudentService sr=new StudentServiceIMP();
			System.out.println(" 1.add new student \n 2.add skill for a student\n "
			+ "3.delete student id \n 4. delete skill for a student\n 5.display all students Skill\n 6.Exits");
			System.out.println("Enter your choice ");
			 choice=sc.nextInt();  
				
			switch(choice)
			{
			case 1:
				sr.addNewStudent();
				
				break;
				
			case 2:
			
				break;
				
			case 3:
				System.out.println("Enter Student id");
				int id=sc.nextInt();
				Object Status = sr.DeleteStudentID();
				break;
				
			case 4:
				break;
				
			case 5:
				List<Student> slist=sr.displayAll();
				
				slist.forEach(ob->{System.out.println(ob);});
				break;
				
			case 6:
				System.out.println("Exits");
				break;
				
			}
					

			
		}while(choice!=6);
	}

}
