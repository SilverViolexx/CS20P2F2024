/*

Program: GuessingGame.java          Last Date of this Revision: September 25, 2024

Purpose: The GuessingGame is a number guessing game played between the computer and one player.

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20

*/
package Mastery;

import java.util.Random;
import java.util.Scanner;

public class GuessingGameMastery 
{

	public static void main(String[] args) 
	{
	// TODO Auto-generated method stub
		//Declaration area
		int secretNum, userNum;
		
		//Preparing to import random number and for user input
		Random r = new Random();
		Scanner userInput = new Scanner(System.in);
		
		//Initialize variable
		secretNum = r.nextInt(1,21);
		
		//Prompt user to answer question and initialize variable
		System.out.print("Please enter a number between 1 and 20: ");
		userNum = userInput.nextInt();
		
		//Display computer and user answer
		System.out.println("Computer Number: " + secretNum
				+ "\nUser Number: " + userNum);
		
		//Check if the user's number is the same as the computer's
		if (userNum == secretNum) {
			System.out.print("You won!");
		}
		
		else {
			System.out.print("Better luck next time.");
		}
		
	}

}
