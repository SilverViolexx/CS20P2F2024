package SkillBuilder;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TimeConverter {
	
	Scanner userInput = new Scanner(System.in);
	
	public static void HM() {
		double userNum;
		
		Scanner userInput = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		
		System.out.print("Please enter the amount: ");
		 userNum = userInput.nextDouble();
		
		double ans = userNum * 60;
		System.out.print(userNum + " hours is " + df.format(ans) + " minutes.");
	}
	
	public static void DH() {
		double userNum;
		
		Scanner userInput = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		
		System.out.print("Please enter the amount: ");
		userNum = userInput.nextDouble();
		
		double ans = userNum * 24;
		System.out.print(userNum + " days is " + df.format(ans) + " hours.");
	}
	
	public static void MH() {
		double userNum;
		
		Scanner userInput = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		
		System.out.print("Please enter the amount: ");
		userNum = userInput.nextDouble();
		
		double ans = userNum / 60;
		System.out.print(userNum + " minutes is " + df.format(ans) + " hours.");
	}
	
	public static void HD() {
		double userNum;
		
		Scanner userInput = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		
		System.out.print("Please enter the amount: ");
		userNum = userInput.nextDouble();
		
		double ans = userNum / 24;
		System.out.print(userNum + " hours is " + df.format(ans) + " days.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String convert;
		double userNum;
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter which converter you need:"
				+ "\n1 - Hours to minutes"
				+ "\n2 - Days to hours"
				+ "\n3 - Minutes to hours"
				+ "\n4 - Hours to days");
		convert = userInput.next();
		
		if (convert.equalsIgnoreCase("1")) {
			HM();
		}
		else if (convert.equalsIgnoreCase("2")) {
			DH();
		}
		else if (convert.equalsIgnoreCase("3")) {
			MH();
		}
		else if (convert.equalsIgnoreCase("4")){
			HD();
		}
		else {
			System.out.print("Invalid conversion type.");
		}
		
	}

}
