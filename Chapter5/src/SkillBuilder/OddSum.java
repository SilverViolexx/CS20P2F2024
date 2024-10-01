/*

Program: OddSum.java          Last Date of this Revision: October 1, 2024

Purpose: Create an OddSum application that prompts the user for a number and then sums the odd numbers from 1 
to the number entered

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20
 
*/
package SkillBuilder;

import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int userNum, i, sum;
	sum = 0;
			
	Scanner userInput = new Scanner(System.in);
	userNum = userInput.nextInt();
			
	for (i = 1; i <= userNum; i+=1) {
		if (i % 2 != 0) {
			sum += i;
		}
	}
	System.out.println("The sum of the odd numbers is " + sum + ".");
		
	}

}
