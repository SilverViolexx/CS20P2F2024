/*
Program: Palindrome.java          Last Date of this Revision: November 19, 2024

Purpose: Create a Palindrome application that prompts the user for a string and then displays a message 
indicating whether or not the string is a palindrome.

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20
 
*/
package Mastery;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration area
		String phrase;
		int length, loop;
		loop = 0;
		char[] letters;
		boolean isPalindrome = true;
		
		//Prepare for user input
		Scanner userInput = new Scanner(System.in);
		
		//Prompt user
		System.out.println("Please enter a string:");
		phrase = userInput.nextLine();
		
		//Removing spaces and punctuation
		phrase = phrase.replaceAll("\\W", "");
		
		//Separates characters
		phrase = phrase.toUpperCase();
		letters = phrase.toCharArray();
		
		//String length
		length = letters.length - 1;
		
		//Loops until loop is greater than length or break condition
		while (loop < length) {
			//Compares characters
			if (letters[loop] != letters[length]) {
				isPalindrome = false;
				break;
			}
			loop++;
			length--;
		}
		
		//Display answer
		if (isPalindrome) {
			System.out.print("This string is a palindrome.");
		}
		else {
			System.out.print("This string is not a palindrome.");
		}
		
		
	}

}

/*
Please enter a string:
hello there
This string is not a palindrome.

Please enter a string:
Never odd or even
This string is a palindrome.
*/
