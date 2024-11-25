/*
Program: GradeBook.java          Last Date of this Revision: November 20, 2024

Purpose: Create a CourseGrades application that simulates a grade book for a class with 12 students that each have 
5 test scores.

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20
 
*/
package Mastery;

import java.util.Scanner;

public class GradeBook {
	private int[][] grades;
	
	//Constructor method
	public GradeBook(int numStudents, int numGrades) 
	{
		grades = new int[numStudents][numGrades];
	}
	
	//Inputs grades for each student
	public void getGrades() 
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter 5 test scores for each student:");
		
		for(int stu=0; stu < grades.length; stu++)
		{
			System.out.println("Student " + (stu + 1) + ":");
			for(int grd=0; grd < grades[0].length; grd++) 
			{
				grades[stu][grd] = userInput.nextInt();
			}
		}
	}
	
	//Displays students and grades
	public void showGrades() 
	{
		for(int stu=0; stu < grades.length; stu++)
		{
			System.out.print("\nStudent " + (stu + 1) + ": ");
			for(int grd=0; grd < grades[0].length; grd++)
			{
				if ((grd + 1) == grades[0].length) 
				{
					System.out.print(grades[stu][grd]);
				}
				else 
				{
					System.out.print(grades[stu][grd] + ", ");
				}
			}
		}
		System.out.println();
	}
	
	//Student average
	public double stuAvg(int stu)
	{
		int sum = 0;
		double avg = 0;
		for(int grd=0; grd < grades[0].length; grd++)
		{
			sum += grades[stu -1][grd];
		}
		avg = (double)sum / grades[0].length;
		
		return avg;
	}
	
	//Test average
	public double testAvg(int grd)
	{
		int sum = 0; 
		double avg = 0;;
		for (int stu = 0; stu < grades.length; stu++) 
		{
			sum += grades[stu][grd -1];
		}
		avg = (double)sum / grades.length;
		
		return avg;
	}
	
	
}
