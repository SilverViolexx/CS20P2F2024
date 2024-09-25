/*

Program: QuadraticEquation.java          Last Date of this Revision: September 25, 2024

Purpose: Create a QuadraticEquation application that gives the solution to any quadratic equation.

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20

*/
package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class QuadraticEquationsMastery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Declaration area
	double varA, varB, varC, x1, x2;
	
	//Shorten decimals to 2 decimal places
	DecimalFormat df = new DecimalFormat("#0.00");
	
	//Preparing for user input and 
	Scanner userInput = new Scanner(System.in);
		
	//Prompt user to answer questions and initialize variables
	System.out.print("Please enter a value for a: ");
	varA = userInput.nextInt();
	System.out.print("Please enter a value for b: ");
	varB = userInput.nextInt();
	System.out.print("Please enter a value for c: ");
	varC = userInput.nextInt();
	
	//Calculate roots
	x1 = (-varB + Math.sqrt(Math.pow(varB,2) - 4 * varA * varC)) / (2 * varA);
	x2 = (-varB - Math.sqrt(Math.pow(varB,2) - 4 * varA * varC)) / (2 * varA);
	
	//Display answer to user
	System.out.print("The roots are " + df.format(x1) + " and " + df.format(x2) + ".");

	}

}
