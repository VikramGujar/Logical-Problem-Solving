package com.logical.jan_02;

public class Student 
{

	private int id;
	private String name;
	private double marks;
	private String course;
	private String gender;
	
	
	public Student(int id, String name, double marks, String course, String gender) 
	{
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.course = course;
		this.gender = gender;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getMarks() {
		return marks;
	}


	public void setMarks(double marks) {
		this.marks = marks;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}

	

	public String getGender() {
		return gender;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", course=" + course + ", gender=" + gender
				+ "]";
	}



	
	
	
	
	
	
}
