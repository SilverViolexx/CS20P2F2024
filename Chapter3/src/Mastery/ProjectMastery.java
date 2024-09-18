/*

Program: ProjectMastery.java          Last Date of this Revision: September 15, 2024

Purpose: Create a Project application to help analyze the time taken for a Java project.

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20
 

*/
package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProjectMastery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Shorten decimals to 2 decimal places
	DecimalFormat df = new DecimalFormat("#0.00");
	
	//Declaration area
	double design, code, debug, test, timeAmt;
	
	//Preparing for user input
		Scanner userInput = new Scanner(System.in);
	
	//Prompt the user and initialize the variables
	System.out.print("Enter the amount of minutes spent on each of the following project tasks: "
			+ "\nDesigning: ");
	design = userInput.nextDouble();
	
	System.out.print("Coding: ");
	code = userInput.nextDouble();
	
	System.out.print("Debugging: ");
	debug = userInput.nextDouble();
	
	System.out.print("Testing: ");
	test = userInput.nextDouble();
	
	//Calculate time percentage spent on each task
	timeAmt = design + code + debug + test;
	design = (design / timeAmt) * 100;
	code = (code / timeAmt) * 100;
	debug = (debug / timeAmt) * 100;
	test = (test / timeAmt) * 100;
	
	//Display results to user
	System.out.print("\n"
			+ "Time spent on each task:"
			+ "\nDesgining: " + df.format(design) + "%"
			+ "\nCoding: " + df.format(code) + "%"
			+ "\nDebugging: " + df.format(debug) + "%"
			+ "\nTesting: " + df.format(test) + "%");
	
	}

}
