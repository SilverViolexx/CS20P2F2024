/*

Program: DigitMastery.java          Last Date of this Revision: September 13, 2024

Purpose: Modify the Digits application created in a review earlier in this chapter to show the hundreds-place 
digit of a three digit number.

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20
 

*/
package Mastery;

import java.util.Scanner;

public class DigitsMastery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration area
		int hundreds, tens, ones, userNum;
		
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
		
		//Ask user to input a 2-digit number and record it
		System.out.print("Please enter a 3-digit number: ");
		userNum = userInput.nextInt();
		
		//Initialize the variables and calculate the hundreds, tens and ones place
		hundreds = userNum / 100 ;
		userNum -= hundreds * 100;
		tens = userNum / 10;
		userNum -= tens * 10;
		ones = userNum;
		
		
		//Output the tens and ones place
		System.out.print("The hundreds-place digit is:  " + hundreds 
				+ "\nThe tens-place digit is:  " + tens 
				+ "\nThe ones-place digit is:  " + ones);
	}

}
