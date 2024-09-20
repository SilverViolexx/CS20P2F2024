/*

Program: ProjectMastery.java          Last Date of this Revision: September 15, 2024

Purpose: Create a Hurricane application that displays the wind speed for the hurricane category entered 
by the user. 

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20
 

*/
package SkillBuilder;

import java.util.Scanner;

public class Hurricane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Declaration Area
	int category;
		
	//Preparing for user input
	Scanner userInput = new Scanner(System.in);
			
	//Prompt the user and initialize the variables
	System.out.print("Please enter the huricane category: ");
	category = userInput.nextInt();
	
	if (category == 1) {
		System.out.print("Miles per hour: 74-95 mph"
				+ "\nKnots: 64-82 kt"
				+ "\nKilometers per hour: 119-153 km/hr");
	}
		
	if (category == 2) {
		System.out.print("Miles per hour: 96-110 mph"
				+ "\nKnots: 83-95 kt"
				+ "\nKilometers per hour: 154-177 km/hr");
	}
	
	if (category == 3) {
		System.out.print("Miles per hour: 111-130 mph"
				+ "\nKnots: 96-113 kt"
				+ "\nKilometers per hour: 178-209 km/hr");
	}
	
	if (category == 4) {
		System.out.print("Miles per hour: 131-155 mph"
				+ "\nKnots: 114-135 kt"
				+ "\nKilometers per hour: 210-249 km/hr");
	}
	
	if (category == 5) {
		System.out.print("Miles per hour: >155 mph"
				+ "\nKnots: >135 kt"
				+ "\nKilometers per hour: >249 km/hr");
	}
	
	else {
		System.out.print("Invalid category, please try again.");
	}
	
	
	
	}

}
