/*
Program: EvensAndOdds.java          Last Date of this Revision: November 18, 2024

Purpose: Create a Palindrome application that prompts the user for a string and then displays a message 
indicating whether or not the string is a palindrome.

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20
 
*/
package Mastery;

import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration area
		String phrase;
		int length, loop;
		loop = 0;
		char[] letters;
		
		//Prepare for user input
		Scanner userInput = new Scanner(System.in);
		
		//Prompt user
		System.out.println("Please enter a string:");
		phrase = userInput.nextLine();
		
		//Removing spaces and punctuation
		phrase = phrase.replaceAll("\\W", "");
		
		//Separates characters
		phrase = phrase.toUpperCase();
		System.out.println(phrase);
		letters = phrase.toCharArray();
		System.out.println(letters);
		
		//String length
		length = letters.length -1;
		
		//Loops until break condition
		while (true) {
			char first = letters[0];
			char last = letters[length];
			
			//Compares characters
			if (loop == length) {
				System.out.print("This string is a palindrome.");
				break;
			}
			else if (first == last) {
				loop ++;
				length--;
				continue;
			}
			else {
				System.out.print("This string is not a palindrome.");
				break;
			}
	
		}
		
		
	}

}
