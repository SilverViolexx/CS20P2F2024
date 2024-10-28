package Mastery;

import java.util.Scanner;

public class TestMySavings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration area
		int option;
		
		//Prepare for user input
		Scanner userInput = new Scanner(System.in);
		
		MySavings amount = new MySavings(0, 0, 0, 0);
		
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
		
		switch(option) {
		case 0:
			break;
		case 1: 
			showTotal();
			break;
		case 2:
			break;
		case 3: 
			break;
		case 4:
			break;
		case 5: 
			break;
		case 6:
			break;
		default: System.out.println("Invalid option.");
		}
			//
		
	}

}
