package SkillBuilder;

import java.util.*;

public class Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Preparing for user input
	Scanner userInput = new Scanner(System.in);
	
	//Ask user to input a 2-digit number
	System.out.print("Please enter a 2-digit number: ");
	
	//Record user input
	String userNum = userInput.nextLine();
	
	//Declare and initialize variables, then calculate tens and ones place
	int tens = Integer.parseInt(userNum) / 10;
	int ones = Integer.parseInt(userNum) - (tens * 10);
	
	//Output the tens and ones place
	System.out.print("There are " + tens + " tens and " + ones + " ones in the number " + userNum + ".");
	}
}
