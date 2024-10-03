package Mastery;

import java.util.Scanner;

public class GroupAssignmentMastery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Declaration area
	String firstN, lastN, firstL, lastL, group1, group2;
	group1 = "abcdefghi";
	group2 = "jklmnopqrs";
		
	//Preparing for user input and 
	Scanner userInput = new Scanner(System.in);
	
	//Prompt user to input first and last name
	System.out.print("Enter your first name: ");
	firstN = userInput.next();
	System.out.print("Enter your last name: ");
	lastN = userInput.next();
	
	//Assign group number by last name
	lastL = lastN.substring(1);
	
	if (lastL.compareToIgnoreCase(group1)) {
		System.out.print(firstN + " " + lastN + " is assigned to Group 1.");
	}
	else if (lastL.compareToIgnoreCase(group2)) {
		System.out.print(firstN + " " + lastN + " is assigned to Group 2.");
	}
	else {
		System.out.print(firstN + " " + lastN + " is assigned to Group 3.");
	}
		
		
		
		
	}

}
