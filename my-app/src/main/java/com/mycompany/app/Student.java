package com.mycompany.app;

public class Student {
	private int studentId;
	private String pib;
	private int course;
	
	public Student(String string, int i) {
		// TODO Auto-generated constructor stub
		this.pib = string;
		this.course = i;
	}
	
	public Student() {}
	// Geters and seters
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getPib() {
		return pib;
	}
	public void setPib(String pib) {
		this.pib = pib;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
}
