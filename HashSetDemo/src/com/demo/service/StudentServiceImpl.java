package com.demo.service;

import java.util.Set;

import com.demo.beans.Student;
import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;

public class StudentServiceImpl implements StudentService{

	StudentDao sdao= new StudentDaoImpl();
	@Override
	public void addNewStudent() {
		// TODO Auto-generated method stub
		sdao.addNewStudent();
		
	}
	@Override
	public void displayAllStudent() {
		// TODO Auto-generated method stub
		sdao.displayAllStudent();
	}
	@Override
	public Student displaybyID(int id) {
		// TODO Auto-generated method stub
		return sdao.searchbyID(id);
	}
	@Override
	public Set<Student> displayByName(String nm) {
		// TODO Auto-generated method stub
		return sdao.searchByName(nm);
	}

}
