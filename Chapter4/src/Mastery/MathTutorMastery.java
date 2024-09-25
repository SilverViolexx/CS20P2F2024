/*

Program: MathTutor.java          Last Date of this Revision: September 24, 2024

Purpose: Create a MathTutor application that displays math problems by randomly generating two numbers, 1 
through 10 and an operator (*, +, –, /), and then prompts the user for an answer. The application should 
check the answer, display a message, and the correct answer, if necessary.

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20
 
*/
package Mastery;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class MathTutorMastery 
{

	public static void main(String[] args) 
	{
		//Declaration area
		double userAns, mathAns,firstNum, secondNum;
		int operator;
		
		//Shorten decimals to 3 decimal places
		DecimalFormat df = new DecimalFormat("#0.000");
		
		//Preparing to import random number and for user input
		Random r = new Random();
		Scanner userInput = new Scanner(System.in);
		
		//Initialize variables
		mathAns = 0;
		operator = r.nextInt(1,5);
		firstNum = r.nextInt(1,11);
		secondNum = r.nextInt(1,11);

		//Display the math problem to user and calculate the answer
		switch (operator) {
			case 1: System.out.print("What is " + firstNum + " + " + secondNum + "? ");
			mathAns = firstNum + secondNum;
			break;
			case 2: System.out.print("What is " + firstNum + " - " + secondNum + "? ");
			mathAns = firstNum - secondNum;
			break;
			case 3: System.out.print("What is " + firstNum + " * " + secondNum + "? ");
			mathAns = firstNum * secondNum;
			break;
			case 4: System.out.print("What is " + firstNum + " / " + secondNum + "? ");
			mathAns = firstNum / secondNum;
			break;
			default: System.out.print("Sorry, something went wrong.");
		}
		
		//Prompt user to answer question
		userAns = userInput.nextDouble();
		
        //Check if answer is correct, if not display correct answer
		if (userAns == mathAns) {
			System.out.print("Correct!");
		}
		
		else {
			System.out.print("Incorrect, the answer is " + df.format(mathAns));
		}
		
		
	}

}
