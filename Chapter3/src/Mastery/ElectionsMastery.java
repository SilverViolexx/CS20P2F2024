/*

Program: Elections.java          Last Date of this Revision: September 18, 2024

Purpose: Write a program that prompts the user for the election results

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ElectionsMastery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Shorten decimals to 2 decimal places
	DecimalFormat df = new DecimalFormat("#0.00");
	DecimalFormat df1 = new DecimalFormat("#0");
		
	//Declaration area
	Double AwNY, AwNJ, AwC, MaNY, MaNJ, MaC, AwAmt, MaAmt, AwPct, MaPct, total;
		
	//Preparing for user input
	Scanner userInput = new Scanner(System.in);
	
	//Prompt the user and initialize the variables
	System.out.print("Please enter the number of votes for each person in each state:"
			+ "\nAwbrey: "
			+ "\nNew York -    ");
	AwNY = userInput.nextDouble();
	
	System.out.print("New Jersey -  ");
	AwNJ = userInput.nextDouble();
	
	System.out.print("Connecticut - ");
	AwC = userInput.nextDouble();
	
	System.out.print("\n"
			+ "Martinez:"
			+ "\nNew York -    ");
	MaNY = userInput.nextDouble();
	
	System.out.print("New Jersey -  ");
	MaNJ = userInput.nextDouble();
	
	System.out.print("Connecticut - ");
	MaC = userInput.nextDouble();
	
	//Calculate total votes and percentages
	AwAmt = AwNY + AwNJ + AwC;
	MaAmt = MaNY + MaNJ + MaC;
	total = AwAmt + MaAmt;
	AwPct = (AwAmt / total) * 100;
	MaPct = (MaAmt / total) * 100;
	
	//Display results to user
	System.out.print("\n"
			+ "Canditate        Votes       Percentage"
			+ "\nAwbrey           " + df1.format(AwAmt) + "           " + df.format(AwPct) + "%"
			+ "\nMartinez         " + df1.format(MaAmt) + "           " + df.format(MaPct) + "%"
			+ "\n"
			+ "\nTotal Votes - " + df1.format(total));
	}

}
