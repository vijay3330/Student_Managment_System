package com.stud.serviceImplementaion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.stud.controller.*;
import com.stud.service.Student;
import com.stud.service.Student_not_found_Exception;

public class StudentImplementaion implements Student {

	Scanner sc = new Scanner(System.in);
	ArrayList<StudentController> al = new ArrayList<>();

	@Override
	public void addStudent() {
		System.out.println("Plese Enter how many student records you want to add");
		int recsize = sc.nextInt();
		for (int i = 0; i < recsize; i++) {
			System.out.println("Enter the student id");
			int id = sc.nextInt();
			System.out.println("Enter the student name");
			String name = sc.next();
			System.out.println("Enter the course name");
			String course = sc.next();
			System.out.println("Enter the grade");
			double grade = sc.nextDouble();

			StudentController stc = new StudentController(id, name, course, grade);
			al.add(stc);
		}

	}

	@Override
	public void removeStudent() {

		if (al.isEmpty()) {

			throw new Student_not_found_Exception("No Records found for remove please add reconds...");
		} else {
			System.out.println("Enter ID of student:");
			int rid = sc.nextInt();

			for (int i = 0; i < al.size(); i++) {

				if (rid == al.get(i).getId()) {
					al.remove(i);
					System.out.println("Record Remove Successfully");
				} else {
					throw new Student_not_found_Exception("Please Enter the Valid ID for remove student...");
				}

			}
		}

	}

	@Override
	public void SearechByName() {

		if (al.isEmpty()) {
			throw new Student_not_found_Exception("No Records Found");
		} else {
			System.out.println("Enter the Student name:");
			String sname = sc.next();

			for (StudentController stud : al) {
				if (sname.equalsIgnoreCase(stud.getName())) {
					System.out.println(stud);
				} else {
					throw new Student_not_found_Exception("No records found for name: " + sname);
				}
			}
		}

	}

	@Override
	public void displayAllStudents() throws Student_not_found_Exception {

		if (al.isEmpty()) {
			throw new Student_not_found_Exception("No Records Found");
		} else {
			System.out.print(al);
		}

	}

	@Override
	public void displayAllStudentsByCourse() {

		System.out.println("Enter the Course name:");
		String cname = sc.next();

		for (StudentController std : al) {
			if (cname.equalsIgnoreCase(std.getCourse())) {
				System.out.println(std);
			} else {
				throw new Student_not_found_Exception("No records found for Course name: " + cname);
			}

		}

	}
}
