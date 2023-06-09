package com.demo.Service;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import com.demo.beans.Student;
import com.demo.dao.StudentDaoIMP;
import com.demo.dao.Studentdao;
public class StudentServiceIMP implements StudentService {
	 Scanner sc=new Scanner(System.in);
	 private Studentdao edao;
	 public StudentServiceIMP() {
		 super();
		 this.edao=new StudentDaoIMP();
		 
	 }
	@Override
	public void addNewStudent() {
		
		System.out.println("Enter Student id");
		int sid=sc.nextInt();
		System.out.println("Enter Student Name");
		String nm=sc.next();
		System.out.println("Enter Student Birthdate");
		String bd=sc.next();
		System.out.println("Enter Student Degree");
		String dg=sc.next();
		System.out.println("Enter Student Marks");
		Float mkd=sc.nextFloat();
		System.out.println("Enter Student Skill");
		String Sk=sc.next();
		
		Student st=new Student( sid, nm, bd,dg,  mkd, Sk);
		edao.save(st);
	}


	public List<Student> displayAll() {
		// TODO Auto-generated method stub
		return edao.getAllStudet();
	}
	
	
	

}
