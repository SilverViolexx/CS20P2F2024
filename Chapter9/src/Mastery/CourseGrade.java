/*
Program: CourseGrade.java          Last Date of this Revision: November 20, 2024

Purpose: Create a CourseGrades application that simulates a grade book for a class with 12 students that each have 
5 test scores.

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20
 
*/
package Mastery;

import java.util.Scanner;

public class CourseGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration area
		int student, col, row, count;
		int[][] grade = new int[12][5];
		student = 0;
		
		GradeBook grades = new GradeBook(grade[0].length, grade.length);
		
		/*
		row = grades.length;
		System.out.println(row);
		col = grades[0].length;
		System.out.println(col);
		*/
		
		//Prepare for user input
		Scanner userInput = new Scanner(System.in);
		
		//Prompt user
		for (count = 0; count < 12; count++) {
			student += 1;
			System.out.println("Student " + student + " Grades:");
			grade[count][0] = userInput.nextInt();
			grade[count][1] = userInput.nextInt();
			grade[count][2] = userInput.nextInt();
			grade[count][3] = userInput.nextInt();
			grade[count][4] = userInput.nextInt();
		}
		
		grades.getGrades();
		
		
	}

}
