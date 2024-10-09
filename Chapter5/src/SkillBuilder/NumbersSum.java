/*

Program: NumbersSum.java          Last Date of this Revision: October 1, 2024

Purpose: Create a NumbersSum application that prompts the user for a number and then displays the numbers 1 
through the number entered, each on a separate line. Below the numbers, the sum is displayed.

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20
 
*/
package SkillBuilder;

import java.util.Scanner;

public class NumbersSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int userNum, i, sum;
	sum = 0;
		
	Scanner userInput = new Scanner(System.in);
	System.out.print("Please enter a number: ");
	userNum = userInput.nextInt();
		
	for (i = 1; i <= userNum; i+=1) {
		sum += i;
		System.out.println(i);
	}
	System.out.println("The sum of the numbers is " + sum + ".");
		
	}

}
