/*

Program: ProjectsMastery.java          Last Date of this Revision: September 16, 2024

Purpose: Create an Order application that prompts the employee for the number of burgers, fries, 
and sodas and then displays the total, the tax (6.5%), and the final cost

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20
 

*/
package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class E12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Cuts price amount to 2 decimal places
	DecimalFormat money = new DecimalFormat("#0.00");

	//Declaration area
	int burgers, fries, sodas;
	Double burgerAmt, fryAmt, sodaAmt, total, tax, finalAmt, tendered, change; 
				
	//Preparing for user input
	Scanner userInput = new Scanner(System.in);
		
	//Prompt the user and initialize the variables
	System.out.print("Enter the number of burgers: ");
	burgers = userInput.nextInt();
	
	System.out.print("Enter the number of fries: ");
	fries = userInput.nextInt();
	
	System.out.print("Enter the amount of sodas: ");
	sodas = userInput.nextInt();
	
	//Calculate the amount
	burgerAmt = burgers * 1.69;
	fryAmt = fries * 1.09;
	sodaAmt = sodas * 0.99;
	total = burgerAmt + fryAmt + sodaAmt;
	tax = total * 0.065;
	finalAmt = total + tax;
	
	//Output price to user
	System.out.println("Total before tax : $" + total
			+ "\nTax: $" + money.format(tax)
			+ "\nTotal after tax: $" + money.format(finalAmt));
	
	//Prompt the user and initialize the variable
	System.out.print("Enter the amount tendered: ");
	tendered = userInput.nextDouble();
	
	//Calculate and output change
	change = tendered - finalAmt;
	System.out.println ("Change: $" + money.format(change));
	
	}

}

/* Screen Dump

Paste the output of your code here

Enter the number of burgers: 2
Enter the number of fries: 3
Enter the amount of sodas: 2
Total before tax : $8.63
Tax: $0.56
Total after tax: $9.19
Enter the amount tendered: 10
Change: $0.81

Enter the number of burgers: 4
Enter the number of fries: 0
Enter the amount of sodas: 5
Total before tax : $11.71
Tax: $0.76
Total after tax: $12.47
Enter the amount tendered: 15
Change: $2.53

 
 */
