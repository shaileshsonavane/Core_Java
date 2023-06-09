package com.demo.beans;

import java.util.Objects;

public class Student {
	private int id;
	private String sname;
	private int div;
	private String midm;
	public Student() {
		super();
	}
	public Student(int id, String sname, int div, String midm) {
		super();
		this.id = id;
		this.sname = sname;
		this.div = div;
		this.midm = midm;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getDiv() {
		return div;
	}
	public void setDiv(int div) {
		this.div = div;
	}
	public String getMidm() {
		return midm;
	}
	public void setMidm(String midm) {
		this.midm = midm;
	}
	@Override
	public int hashCode() {
		return this.id;
	}
	@Override
	public boolean equals(Object obj) {
		
		return this.id == ((Student)obj).id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", div=" + div + ", midm=" + midm + "]";
	}
	
}
