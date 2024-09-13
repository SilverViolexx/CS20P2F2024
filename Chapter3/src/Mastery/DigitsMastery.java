package Mastery;

import java.util.Scanner;

public class DigitsMastery {

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
		centAmt -= dimes * 25;
		
		//Initialize and calculate number of nickels in the amount 
		nickels = centAmt / 5;
		centAmt -= nickels * 25;
		
		//Initialize and calculate number of pennies in the amount 
		pennies = centAmt / 5;
		
		
	}

}
