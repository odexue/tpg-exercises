package com.exercises.studentsort;

public class Student {
	
	private Integer id;
	private String firstname;
	private Double gpa;
	
	public Student() {
		
	}
	
	public Student(Integer id, String firstname, Double gpa) {
		this.id = id;
		this.firstname = firstname;
		this.gpa = gpa;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String toString() {
		return id + " " + firstname + " " + gpa;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getGpa() {
		return gpa;
	}

	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}

}

















