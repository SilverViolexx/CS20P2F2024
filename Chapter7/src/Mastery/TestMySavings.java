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
		
		MySavings amount = new MySavings(0);
		
		//Display conversion options and prompt user to input an option and record it
		System.out.print("Convert:"
			+ "\n1. Show total money in bank."
			+ "\n2. Add a penny."
			+ "\n3. Add a nickel."
			+ "\n4. Add a dime."
			+ "\n5. Add a quarter."
			+ "\n6. Take out money from the bank."
			+ "\nEnter 0 to quit."
			+ "\nPlease enter your choice: ");
		option = userInput.nextInt();
		
		while (option >= 0) {
					
			switch(option) {
			case 0:
				break;
			case 1: System.out.println(amount.showTotal());
				break;
			case 2: amount.addPennies();
				System.out.println("You have added 1 penny.");
				break;
			case 3: amount.addNickels();
				System.out.println("You have added 1 nickel.");
				break;
			case 4: amount.addDimes();
				System.out.println("You have added 1 dime.");
				break;
			case 5: amount.addQuarters();
				System.out.println("You have added 1 quarter.");
				break;
			case 6: System.out.print("How much money would you like to withdraw?"
					+ "\n$");
				withdraw = userInput.nextDouble();
				System.out.println(amount.takeMoney(withdraw));
				break;
			default: System.out.println("Invalid option.");
			}
		
		System.out.print("Please enter your choice: ");
		option = userInput.nextInt();
			//
		}
		
	}

}