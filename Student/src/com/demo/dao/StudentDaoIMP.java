package com.demo.dao;
import java.util.List;
import java.util.ArrayList;
import com.demo.beans.Student;

public class StudentDaoIMP implements Studentdao{
	private static List<Student> slist;
	static {
		slist=new ArrayList<>();
		slist.add(new Student(1,"shailesh","12-12-1999","Agriculture",78,"Kheti karna"));
		slist.add(new Student(1,"Shamim Ahemad","15-12-2000","B.Tech",98,"Programmer"));
		
	}
	@Override
	public void save(Student s) {
		
		slist.add(s);
		
	}
	
	@Override
	public List<Student> getAllStudet() {
		// TODO Auto-generated method stub
		return slist;
	}
	
	

}
