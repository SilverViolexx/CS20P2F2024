/*

Program: PrimeNumberMastery.java          Last Date of this Revision: October 2, 2024

Purpose: Create 
a PrimeNumber application that prompts the user for a number and then displays a 
message indicating whether the number is prime or not.

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20
 
*/

package Mastery;

import java.util.Scanner;

public class PrimeNumberMastery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Declaration area
	int userNum, prime;
	
	//Preparing for user input and 
	Scanner userInput = new Scanner(System.in);
		
	//Prompt user to input an integer and initialize variables
	System.out.print("Please enter an integer: ");
	userNum = userInput.nextInt();
	prime = userNum;
	
	//Check if the user input is a prime number and display the answer
	while (prime > 0) {
		prime --;
		if (userNum % prime != 0) {
			continue;
		}
		else if (prime == 1) {
			System.out.print(userNum + " is a prime number.");
			break;
		}
		else {
			System.out.print(userNum + " is not a prime number.");
			break;
		}
	}
		
	}

}
