package com.stud.controller;

public class StudentController {
	int id;
	String name;
	String course;
	double grade;

	public StudentController(int id, String name, String course, double grade) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.grade = grade;
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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", grade=" + grade + "]";
	}

}
