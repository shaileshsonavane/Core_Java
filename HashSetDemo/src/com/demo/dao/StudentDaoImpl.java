package com.demo.dao;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import com.demo.beans.Student;

public class StudentDaoImpl implements StudentDao{
	private static Set<Student> sset;
	static {
		sset=new HashSet<>();
		sset.add(new Student(1, "Smeer", 5, "Eng"));
		sset.add(new Student(2, "Amar", 3, "Eng"));
		sset.add(new Student(3, "Sam", 4, "Mar"));
		sset.add(new Student(4, "Pam", 5, "Mar"));
		sset.add(new Student(5, "Dave", 6, "SemiEng"));
		sset.add(new Student(5, "Dave", 6, "SemiEng"));
	}
	@Override
	public void addNewStudent() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter id");
		int id = sc.nextInt();
		System.out.println("Enter name");
		String nm= sc.next();
		System.out.println("Enter Division");
		int dv= sc.nextInt();
		System.out.println("Enter Medium(Eng/Mar/SemiEng");
		String mdm= sc.next();
		sset.add(new Student(id, nm, dv, mdm));
	}
	@Override
	public void displayAllStudent() {
		// TODO Auto-generated method stub
		sset.forEach(s->System.out.println(s));
		
	}
	@Override
	public Student searchbyID(int id) {
		// TODO Auto-generated method stub
		for(Student s:sset) {
			if(s.getId()==id) {
				return s;
			}
		}
		return null;
	}
	@Override
	public Set<Student> searchByName(String nm) {
		// TODO Auto-generated method stub
//		Set<Student> hset=new HashSet<>();
//		for(Student ob:sset) {
//			if(ob.getSname().equals(nm)) {
//			  hset.add(ob);
//			}
//		}
		Set<Student> hset=sset.stream().filter(ob->ob.getSname().equals(nm)).collect(Collectors.toSet());
		if(hset.size()>0)
			return hset;
		return null;
	}

}
