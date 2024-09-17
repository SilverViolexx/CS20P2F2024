/*

Program: DigitsMastery.java          Last Date of this Revision: September 13, 2024

Purpose: Create a Change application that prompts the user for an amount less than $1.00 and then displays 
the minimum number of coins necessary to make the change 

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20
 

*/
package Mastery;

import java.util.Scanner;

public class E7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare variables
		int centAmt, quarters, dimes, nickels, pennies;
		
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
		
		//Prompt user to input amount of money in cents
		System.out.print("Please enter amount in cents: ");
		centAmt = userInput.nextInt();
		
		//Initialize and calculate number of quarters in the amount 
		quarters = centAmt / 25;
		centAmt -= quarters * 25;
		
		//Initialize and calculate number of dimes in the amount 
		dimes = centAmt / 10;
		centAmt -= dimes * 10;
		
		//Initialize and calculate number of nickels in the amount 
		nickels = centAmt / 5;
		centAmt -= nickels * 5;
		
		//Initialize and calculate number of pennies in the amount 
		pennies = centAmt / 1;
		
		//Output amount of quarters, dimes, nickels and pennies
		System.out.println("The minimum amount of coins is:"
				+ "\nQuarters: " + quarters
				+ "\nDimes: " + dimes
				+ "\nNickels: " + nickels
				+ "\nPennies: " + pennies);
	}

}
