package com.stud.main;

import java.util.Scanner;

import com.stud.service.Student_not_found_Exception;
import com.stud.serviceImplementaion.StudentImplementaion;

public class Main {

	public static void main(String[] args) {
		StudentImplementaion st = new StudentImplementaion();

		Scanner sc = new Scanner(System.in);
		System.out.println("*************Welcom To Student managment System**************");
		System.out.println("***********************************************");

		char ch;
		do {
			System.out.println("Enter the choice which operation you want to perform:");
			System.out.println("1. Add a student");
			System.out.println("2. Remove a student");
			System.out.println("3. Search for a student by name");
			System.out.println("4. Display a list of all students");
			System.out.println("5. Display a list of students by course");
			System.out.println("6. Exit");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:

				st.addStudent();
				break;
			case 2:
				try {
					st.removeStudent();
				} catch (Student_not_found_Exception e) {
					e.printStackTrace();
				}

				break;
			case 3:
				try {
					st.SearechByName();
				} catch (Student_not_found_Exception e) {
					e.printStackTrace();
				}

				break;
			case 4:
				try {
					st.displayAllStudents();
				} catch (Student_not_found_Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 5:
				try {
					st.displayAllStudentsByCourse();
				} catch (Student_not_found_Exception e) {
					e.printStackTrace();
				}
				break;
			case 6:
				System.out.println("Exiting the program...");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}
			System.out.println("Do you want to continue Yes/ y No/n....");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

		sc.close();
	}
}
