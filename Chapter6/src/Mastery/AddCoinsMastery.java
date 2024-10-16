/*

Program: AddCoinsMastery.java          Last Date of this Revision: October 15, 2024

Purpose: Create an AddCoins application that prompts the user for the number of pennies, nickels, dimes, 
and quarters, and then displays their total dollar amount.

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20
 
*/
package Mastery;

import java.util.Scanner;

public class AddCoinsMastery {

	public static String getDollarAmount(int pennies, int nickels, int dimes, int quarters) {
		//Calculate price of each type of coin and total sum
		double penniesAmt = pennies * 0.01;
		double nickelsAmt = nickels * 0.05;
		double dimesAmt = dimes * 0.1;
		double quartersAmt = quarters * 0.25;
		double sum = penniesAmt + nickelsAmt + dimesAmt + quartersAmt;
		return("$" + sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration area
		int pennies, nickels, dimes, quarters;
		
		//Preparing for user input 
		Scanner userInput = new Scanner(System.in);
		
		//Prompt user to input an integer and initialize variables
		System.out.print("Please enter the total amount of coins."
				+ "\nQuarters: ");
		quarters = userInput.nextInt();
		System.out.print("Dimes: ");
		dimes = userInput.nextInt();
		System.out.print("Nickels: ");
		nickels = userInput.nextInt();
		System.out.print("Pennies: ");
		pennies = userInput.nextInt();

		//Display total sum to user
		System.out.print("Total: " + getDollarAmount(pennies, nickels, dimes, quarters));
	}

}

/*
Please enter the total amount of coins.
Quarters: 8
Dimes: 5
Nickels: 2
Pennies: 4
Total: $2.64

Please enter the total amount of coins.
Quarters: 2
Dimes: 0
Nickels: 1
Pennies: 3
Total: $0.58
*/