/*

Program: PerfectSquare.java          Last Date of this Revision: September 23, 2024

Purpose: Create a PerfectSquare application that prompts the user for an integer and then displays a message indicating whether or not the number is a perfect square.

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20
 

*/
package SkillBuilder;

import java.util.Scanner;
import java.util.Math;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Declaration area
	
	double squareRoot, userNum, square;
				
	//Preparing for user input and square root
	Scanner userInput = new Scanner(System.in);
	
		
	//Prompt the user and initialize the variables
	System.out.print("Please enter an integer: ");
	userNum = userInput.nextInt();
	
	//Calculate the square of the variable
	squareRoot = Math.sqrt(userNum);
	square = Math.pow(squareRoot, 2);
	
	//Check if "square" squared is the same the user number
	if (square == userNum) {
		System.out.print("This ");
	}
	
	
	//Display answer to user
	System.out.print("");
		
	}

}
