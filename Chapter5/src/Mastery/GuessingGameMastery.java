/*

Program: GuessingGameMastery.java          Last Date of this Revision: October 3, 2024

Purpose: Modify the algorithm to allow for as many guesses as needed.

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20
 
*/
package Mastery;

import java.util.Random;
import java.util.Scanner;

public class GuessingGameMastery {

	public static void main(String[] args) {
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
	
	//Continue looping until userNum is equal to the secretNum
	while (userNum != secretNum) {
		if (userNum < 1 || userNum > 20) {
			System.out.print("Invalid number, please try again."
					+ "\nPlease enter a number between 1 and 20: ");
			userNum = userInput.nextInt();
			continue;
		}
		else {
			System.out.print("Try again."
			+ "\nPlease enter a number between 1 and 20: ");
		userNum = userInput.nextInt();
		}
	}
	
	if (userNum == secretNum) {
		System.out.print("You won!");
	}
	
	}

}
