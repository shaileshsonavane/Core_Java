package com.demo.service;

import java.util.Set;

import com.demo.beans.Student;

public interface StudentService {

	void addNewStudent();

	void displayAllStudent();

	Student displaybyID(int id);

	Set<Student> displayByName(String nm);

}
