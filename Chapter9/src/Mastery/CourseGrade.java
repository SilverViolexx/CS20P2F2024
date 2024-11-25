/*
Program: CourseGrade.java          Last Date of this Revision: November 20, 2024

Purpose: Create a CourseGrades application that simulates a grade book for a class with 12 students that each have 
5 test scores.

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20
 
*/
package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CourseGrade 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Declaration area
		int student, test;
		int[][] grade = new int[5][2];
		student = 0;
		
		//Prepare for user input and shorten answer to 2 decimal places
		Scanner userInput = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		
		//New object
		GradeBook grades = new GradeBook(grade[0].length, grade.length);
		
		//Prompts user to enter grades
		grades.getGrades();
		
		//Displays grades of each student
		grades.showGrades();
		
		//Loop until break condition
		while (true) 
		{
			//Prompt user
			System.out.print("\nWhich student would you like to see the average of?(Enter 0 to continue)"
					+ "\nStudent: ");
			student = userInput.nextInt();
			
			//Displays student average
			if (student == 0) 
			{
				break;
			}
			else 
			{
				System.out.println("Their average is " + df.format(grades.stuAvg(student)));
			}
		}
		
		//Loop until break condition
		while (true) 
		{
			//Prompt user
			System.out.print("\nWhich test would you like to see the average of?(Enter 0 to quit)"
					+ "\nTest: ");
			test = userInput.nextInt();
			
			//Displays test average
			if (test == 0) 
			{
				break;
			}
			else 
			{
				System.out.println("The test average is " + df.format(grades.testAvg(test)));
			}
		}

	}

}

/*
Please enter 5 test scores for each student:
Student 1:
25
50
50
50
80
Student 2:
25
25
50
80
100

Student 1: 25, 50, 50, 50, 80
Student 2: 25, 25, 50, 80, 100

Which student would you like to see the average of?(Enter 0 to continue)
Student: 1
Their average is 51.00

Which student would you like to see the average of?(Enter 0 to continue)
Student: 0

Which test would you like to see the average of?(Enter 0 to quit)
Test: 4
The test average is 65.00

Which test would you like to see the average of?(Enter 0 to quit)
Test: 0



Please enter 5 test scores for each student:
Student 1:
100
100
75
80
50
Student 2:
100
50
50
60
25

Student 1: 100, 100, 75, 80, 50
Student 2: 100, 50, 50, 60, 25

Which student would you like to see the average of?(Enter 0 to continue)
Student: 2
Their average is 57.00

Which student would you like to see the average of?(Enter 0 to continue)
Student: 0

Which test would you like to see the average of?(Enter 0 to quit)
Test: 5
The test average is 37.50

Which test would you like to see the average of?(Enter 0 to quit)
Test: 0



*/