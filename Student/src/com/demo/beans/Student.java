package com.demo.beans;

import java.util.Date;

public class Student {
	private int sid;
	private String name;
	private String bdate;
	private String degree;
	private float marksdegree;
	private String Skill;
	
	
	
	public Student() {
		super();
		this.sid = 0;
		this.name = null;
		this.bdate = null;
		this.degree = null;
		this.marksdegree = 0;
		this.Skill=null;
	}

	public Student(int sid, String name,String bdate, String degree, float marksdegree,String Skill) {
		super();
		this.sid = sid;
		this.name = name;
		this.bdate = bdate;
		this.degree = degree;
		this.marksdegree = marksdegree;
		this.Skill=Skill;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public float getMarksdegree() {
		return marksdegree;
	}

	public void setMarksdegree(float marksdegree) {
		this.marksdegree = marksdegree;
	}

	public String getSkill() {
		return Skill;
	}

	public void setSkill(String skill) {
		Skill = skill;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", bdate=" + bdate + ", degree=" + degree + ", marksdegree="
				+ marksdegree + ", Skill=" + Skill + "]";
	}

	
	

}
