package SkillBuilder;

import java.util.*;

public class GradeAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Preparing for user input
	Scanner userInput = new Scanner(System.in);
		
	//Ask user to enter first grade then record and declare/initialize user input
	System.out.print("Please enter the first grade: ");
	int grade1 = userInput.nextInt();
	
	//Ask user to enter second grade then record and declare/initialize user input
	System.out.print("Please enter the second grade: ");
	int grade2 = userInput.nextInt();
		
	//Ask user to enter third grade then record and declare/initialize user input
	System.out.print("Please enter the third grade: ");
	int grade3 = userInput.nextInt();
	
	//Ask user to enter fourth grade then record and declare/initialize user input
	System.out.print("Please enter the fourth grade: ");
	int grade4 = userInput.nextInt();
		
	//Ask user to enter fifth grade then record and declare/initialize user input
		System.out.print("Please enter the fifth grade: ");
		int grade5 = userInput.nextInt();
		
	//Calculate grade average
	int sum = grade1 + grade2 + grade3 + grade4 + grade5;
	int average = sum / 5;
	
	//Output the average grades
	System.out.print("The average of the grades is " + average + "%.");
		
	}

}
