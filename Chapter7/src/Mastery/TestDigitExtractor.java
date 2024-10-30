package Mastery;

import java.util.Scanner;

public class TestDigitExtractor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration area
		int userNum; 
		String option;
		boolean quit;
		
		//Prepare for user input
		Scanner userInput = new Scanner(System.in);
				
		//Create new object
		DigitExtractor Num = new DigitExtractor(0, 0, 0, 0);
		
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
		quit = option.equalsIgnoreCase("q");
		
		while (quit = true) {
			
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
			else {
				System.out.println("Invaild option");
			}
			
			System.out.print("Enter your choice: ");
			option = userInput.next();
			
			quit = option.equalsIgnoreCase("q");
		}
	}

}
