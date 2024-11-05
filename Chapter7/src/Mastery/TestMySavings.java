/*

Program: AddCoinsMastery.java          Last Date of this Revision: October 29, 2024

Purpose: Create a MySavings application that displays a menu of choices for entering pennies, nickels, dimes, and 
quarters into a piggy bank and then prompts the user to make a selection

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20
 
*/

package Mastery;

import java.util.Scanner;

public class TestMySavings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration area
		int option;
		double withdraw;
		
		//Prepare for user input
		Scanner userInput = new Scanner(System.in);
		
		//Create new object
		MySavings amount = new MySavings();
		amount.setTotal(0);
		
		//Display options and prompt user to input an option and record it
		System.out.print("1. Show total money in bank."
			+ "\n2. Add a penny."
			+ "\n3. Add a nickel."
			+ "\n4. Add a dime."
			+ "\n5. Add a quarter."
			+ "\n6. Take out money from the bank."
			+ "\nEnter 0 to quit."
			+ "\nPlease enter your choice: ");
		option = userInput.nextInt();
		
		//Continue loop until user input invalid
		while (option >= 0) {
			
			//Display answer to user based on option picked
			switch(option) {
			case 0:
				break;
			case 1: System.out.println(amount.showTotal()); //Shows total
				break;
			case 2: amount.addPennies(); //Adds 0.01 to total
				System.out.println("You have added 1 penny.");
				break;
			case 3: amount.addNickels(); //Adds 0.05 to total
				System.out.println("You have added 1 nickel.");
				break;
			case 4: amount.addDimes(); //Adds 0.1 to total
				System.out.println("You have added 1 dime.");
				break;
			case 5: amount.addQuarters(); //Adds 0.25 to total
				System.out.println("You have added 1 quarter.");
				break;
			case 6: System.out.print("How much money would you like to withdraw?" //Prompt user to input number to withdraw
					+ "\n$");
				withdraw = userInput.nextDouble(); //Initialize input
				System.out.println(amount.takeMoney(withdraw)); //Shows total after withdrawal
				break;
			default: System.out.println("Invalid option.");
			}
		
		//Prompt user to input new option to continue or end loop, initialize input
		System.out.print("Please enter your choice: ");
		option = userInput.nextInt();
		//Ends loop if option is 0
		if (option <= 0) {
			break;
		}
	}
		
	}

}

/*
Convert:
1. Show total money in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take out money from the bank.
Enter 0 to quit.
Please enter your choice: 5
You have added 1 quarter.
Please enter your choice: 4
You have added 1 dime.
Please enter your choice: 1
Your total balance is: $0.35
Please enter your choice: 6
How much money would you like to withdraw?
$0.05
Your new balance is: $0.30
Please enter your choice: 0

Convert:
1. Show total money in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take out money from the bank.
Enter 0 to quit.
Please enter your choice: 1
Your total balance is: $0.00
Please enter your choice: 2
You have added 1 penny.
Please enter your choice: 6
How much money would you like to withdraw?
$0
Your new balance is: $0.01
Please enter your choice: 0
*/