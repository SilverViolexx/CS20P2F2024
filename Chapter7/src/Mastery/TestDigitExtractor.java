/*

Program: AddCoinsMastery.java          Last Date of this Revision: November 1, 2024

Purpose: Create a DigitExtractor application that prompts the user for an integer and then displays the ones, 
tens, and hundreds digit of the number

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20
 
*/

package Mastery;

import java.util.Scanner;

public class TestDigitExtractor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration area
		int userNum; 
		String option;
		
		//Prepare for user input
		Scanner userInput = new Scanner(System.in);
				
		//Create new object
		DigitExtractor Num = new DigitExtractor(0, 0, 0);
		
		//Prompt user to input an integer an initialize it
		System.out.print("Enter an integer: ");
		userNum = userInput.nextInt();
		
		//Display options and prompt user to input an option and record it
		System.out.print("Show (W)hole number."
			+ "\nShow (O)nes place number."
			+ "\nShow (T)ens place number."
			+ "\nShow (H)undereds place number."
			+ "\n(Q)uit."
			+ "\nEnter your choice: ");
		option = userInput.next();
		
		//Continue loops until break condition
		while (true) {
			//Display answer to user based on option picked
			if (option.equalsIgnoreCase("w")) {
				System.out.println(Num.showNum(userNum));
			}
			else if (option.equalsIgnoreCase("o")) {
				System.out.println(Num.getOnes(userNum));
			}
			else if (option.equalsIgnoreCase("t")) {
				System.out.println(Num.getTens(userNum));
			}
			else if (option.equalsIgnoreCase("h")) {
				System.out.println(Num.getHundreds(userNum));
			}
			else if (option.equalsIgnoreCase("q")) {
				break;
			}
			else {
				System.out.println("Invalid option");
			}
			
			//Prompt user to input option
			System.out.print("Enter your choice: ");
			option = userInput.next();
			
		}
	}

}

/*
Enter an integer: 723
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undereds place number.
(Q)uit.
Enter your choice: w
The whole number is 723.
Enter your choice: o
The ones place digit is 3.
Enter your choice: t
The tens place digit is 2.
Enter your choice: h
The hundreds place digit is 7.
Enter your choice: q

Enter an integer: 637
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undereds place number.
(Q)uit.
Enter your choice: h
The hundreds place digit is 6.
Enter your choice: e
Invalid option
Enter your choice: o
The ones place digit is 7.
Enter your choice: t
The tens place digit is 3.
Enter your choice: w
The whole number is 637.
Enter your choice: q

*/
