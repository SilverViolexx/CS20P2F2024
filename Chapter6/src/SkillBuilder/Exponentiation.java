package SkillBuilder;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exponentiation {

	public static void powerOf(double base, double exponent) {
		DecimalFormat df = new DecimalFormat("#0.00");
		
		double ans = Math.pow(base, exponent);
		System.out.print(base + " to the power of " + exponent + " is equal to " + df.format(ans) + ".");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Please enter the base: ");
		double base = userInput.nextDouble();
		System.out.print("Please enter the exponent: ");
		double exponent = userInput.nextDouble();
		
		powerOf(base,exponent);
	}

}
