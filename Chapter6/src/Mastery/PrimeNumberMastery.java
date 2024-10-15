/*

Program: PrimeNumberMastery.java          Last Date of this Revision: October 15, 2024

Purpose: Modify the PrimeNumber application created in Chapter 6 Exercise 1 to include a method named 
isPrime(). 

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20
 
*/
package Mastery;

import java.util.Scanner;

public class PrimeNumberMastery {
	
	public static boolean isPrime(int userNum) {
		//Declaration and initialization area
		int prime = userNum;
		
		//Checks if the user input is a prime number
		while (prime > 0) {
			prime --;
			if (userNum % prime != 0) {
				continue;
			}
			else if (prime == 1) {
				return (true);
			}
			else {
				break;
			}
		}
		
		//Returns false if the number is not prime
		return (false);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration area
		int userNum;
		
		//Preparing for user input 
		Scanner userInput = new Scanner(System.in);
			
		//Prompt user to input an integer and initialize variables
		System.out.print("Please enter an integer: ");
		userNum = userInput.nextInt();

		//Displays if the number is prime depending if the method returns true or not
		if (isPrime(userNum) == true) {
			System.out.print(userNum + " is a prime number.");
		}
		else {
			System.out.print(userNum + " is not a prime number.");
		}
		
	}

}

/*
Please enter an integer: 17
17 is a prime number.

Please enter an integer: 10
10 is not a prime number.
*/