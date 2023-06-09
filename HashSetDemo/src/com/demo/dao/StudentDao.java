package com.demo.dao;

import java.util.Set;

import com.demo.beans.Student;

public interface StudentDao {

	void addNewStudent();

	void displayAllStudent();

	Student searchbyID(int id);

	Set<Student> searchByName(String nm);

}
