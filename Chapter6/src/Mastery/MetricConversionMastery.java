/*

Program: MetricConversion.java          Last Date of this Revision: October 11, 2024

Purpose: Create a MetricConversion application that displays a menu of conversion choices and then prompts 
the user to choose a conversion.

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20

*/
package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MetricConversionMastery {

	//Converts inches into centimeters
	public static double InCm(double convert) {
		//Calculates inches in centimeters
		return(convert * 2.54);
	}
	
	//Converts feet into centimeters
	public static double FtCm(double convert) {
		//Calculates feet in centimeters
		return(convert * 30);
	}
		
	//Converts yards into meters
	public static double YdM(double convert) {
		//Calculates yards in meters
		return(convert * 0.91);
	}
	
	//Converts miles into kilometers
	public static double MiKm(double convert) {
		//Calculates miles in kilometers
		return(convert * 1.6);
	}
	
	//Converts centimeters into inches
	public static double CmIn(double convert) {
		//Calculates centimeters in inches
		return(convert / 2.54);
	}
		
	//Converts centimeters into feet
	public static double CmFt(double convert) {
		//Calculates centimeters in feet
		return(convert / 30);
	}
	
	//Converts meters into yards
	public static double MYd(double convert) {
		//Calculates meters in yards
		return(convert / 0.91);
	}
	
	//Converts kilometers into miles
	public static double KmMi(double convert) {
		//Calculates kilometers in miles
		return(convert / 1.6);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration area
		int option;
		double number, ans;

		
		//Prepare for user input and shorten answer to 2 decimal places
		Scanner userInput = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		
		//Display conversion options and prompt user to input an option and record it
		System.out.print("Convert:"
				+ "\n1. Inches to Centimeters         5. Centimeters to Inches"
				+ "\n2. Feet to Centimeters           6. Centimeters to Feet"
				+ "\n3. Yard to Meters                7. Meters to Yards"
				+ "\n4. Miles to Kilometers           8. Kilometers to Miles"
				+ "\n"
				+ "\nPlease enter your choice: ");
		option = userInput.nextInt();
		
		//Prompt user to input a number to convert
		System.out.print("Enter a number: ");
		number = userInput.nextDouble();
		
		switch(option) {
		case 1: System.out.println(number + " inches equals to " + df.format(InCm(number)) + " centimeters.");
			break;
		case 2: System.out.println(number + " feet equals to " + df.format(FtCm(number)) + " centimeters.");
			break;
		case 3: System.out.println(number + " yards equals to " + df.format(YdM(number)) + " meters.");
			break;
		case 4: System.out.println(number + " miles equals to " + df.format(MiKm(number)) + " kilometers.");
			break;
		case 5: System.out.println(number + " centimeters equals to " + df.format(CmIn(number)) + " inches.");
			break;
		case 6: System.out.println(number + " centimeters equals to " + df.format(CmFt(number)) + " feet.");
			break;
		case 7: System.out.println(number + " meters equals to " + df.format(MYd(number)) + " yards.");
			break;
		case 8: System.out.println(number + " kilometers equals to " + df.format(KmMi(number)) + " miles.");
			break;
		default: System.out.println("Invalid conversion.");
		}

	}
}

/*
Convert:
1. Inches to Centimeters         5. Centimeters to Inches
2. Feet to Centimeters           6. Centimeters to Feet
3. Yard to Meters                7. Meters to Yards
4. Miles to Kilometers           8. Kilometers to Miles

Please enter your choice: 1
Enter a number: 12
12.0 inches equals to 30.48 centimeters.

Convert:
1. Inches to Centimeters         5. Centimeters to Inches
2. Feet to Centimeters           6. Centimeters to Feet
3. Yard to Meters                7. Meters to Yards
4. Miles to Kilometers           8. Kilometers to Miles

Please enter your choice: 7
Enter a number: 2.5
2.5 meters equals to 2.75 yards.
*/