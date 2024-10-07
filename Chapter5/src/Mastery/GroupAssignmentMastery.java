/*

Program: GroupAssignment.java          Last Date of this Revision: October 7, 2024

Purpose: Create a GroupAssignment application that prompts the user for his or her name and then displays a 
group assignment. The group assignment depends on the first letter of the student’s last name.

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20

*/
package Mastery;

import java.util.Scanner;

public class GroupAssignmentMastery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Declaration area
	String firstN, lastN, group1, group2;
	group1 = "j";
	group2 = "t";
		
	//Preparing for user input and 
	Scanner userInput = new Scanner(System.in);
	
	//Prompt user to input first and last name
	System.out.print("Enter your first name: ");
	firstN = userInput.next();
	System.out.print("Enter your last name: ");
	lastN = userInput.next();
	
	//Compare and assign group number by last name
	if (lastN.compareToIgnoreCase(group1) < 0 ) {
		System.out.print(firstN + " " + lastN + " is assigned to Group 1.");
	}
	else if (lastN.compareToIgnoreCase(group2) < 0) {
		System.out.print(firstN + " " + lastN + " is assigned to Group 2.");
	}
	else {
		System.out.print(firstN + " " + lastN + " is assigned to Group 3.");
	}
		
	}

}
