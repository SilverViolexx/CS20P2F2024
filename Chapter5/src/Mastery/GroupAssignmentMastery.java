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
	
	//Assign group number by last name
	if (lastN.compareToIgnoreCase(group1) <= 0 ) {
		System.out.print(firstN + " " + lastN + " is assigned to Group 1.");
	}
	else if (lastN.compareToIgnoreCase(group2) <= 0) {
		System.out.print(firstN + " " + lastN + " is assigned to Group 2.");
	}
	else {
		System.out.print(firstN + " " + lastN + " is assigned to Group 3.");
	}
		
	}

}
