/*

Program: Delivery.java          Last Date of this Revision: September 23, 2024

Purpose: Create a Delivery application that prompts the user for the length, width, and height of a package, and then 
displays “Reject” if any dimension is greater than 10, and “Accept” if all the dimensions are less than or 
equal to 10.

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20
 

*/
package SkillBuilder;

import java.util.Scanner;

public class Delivery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Declaration area
	int length, width, height;
			
	//Preparing for user input
	Scanner userInput = new Scanner(System.in);
	
	//Prompt the user and initialize the variables
	System.out.print("Please input the length: ");
	length = userInput.nextInt();
	
	System.out.print("Please input the width: ");
	width = userInput.nextInt();
	
	System.out.print("Please input the height: ");
	height = userInput.nextInt();
	
	//Check if any dimension is greater than 10
	if (length <= 10 && width <= 10 && height <= 10) {
		System.out.print("Package size accepted");
	}
	else {
		System.out.print("Package size rejected");
	}
	
	}

}
