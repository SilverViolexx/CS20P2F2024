/*

Program: RandomNum.java          Last Date of this Revision: September 23, 2024

Purpose: Create a RandomNum application that prompts the user for two numbers. The first number is a minimum 
value and the second is a maximum value. RandomNum then displays an integer between the min and max 
values entered by the user.

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20
 

*/
package SkillBuilder;

import java.util.Scanner;
import java.util.Random;

public class RandomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //Preparing to import random number
	Random r = new Random();
		
	//Declaration area
	int minNum, maxNum;
		
	//Preparing for user input
	Scanner userInput = new Scanner(System.in);
	
	//Prompt the user and initialize the variables
	System.out.print("Please enter the minimum value: ");
	minNum = userInput.nextInt();
	
	System.out.print("Please enter the maximum value: ");
    maxNum = userInput.nextInt();
	
    //Display integer between the minimum and maximum input
    System.out.println("Random number: " + (r.nextInt(maxNum - minNum + 1) + minNum));
	}

}
