/*

Program: ConditionalStatement.java          Last Date of this Revision: September 16, 2024

Purpose: Create a Grade application 

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20
 

*/

package SkillBuilder;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Declaration area
		String guess;
		
	//Preparing for user input
	Scanner userInput = new Scanner(System.in);
		
	//Initialize the secret word
	String secretWord = "Calgary";
	
	//Prompt the user
	System.out.println("Please guess the secret word: ");
	
	//Record user input
	guess = userInput.next();
	
	if(guess.equalsIgnoreCase(secretWord))
	{
		System.out.println("Correct!"); //output correct if TRUE
	}
	else
	{
		System.out.println("Incorrect, pelase try again.");
	}
	
	
	}

}

/* Screen Dump

Paste the output of your code here

Please guess the secret word: 
hello
Incorrect, pelase try again.

Please guess the secret word: 
CALGARY
Correct!

 
 */