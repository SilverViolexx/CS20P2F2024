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
		System.out.println("Please enter the initials for which converter you need:"
				+ "\nHM - Hours to minutes"
				+ "\nDH - Days to hours"
				+ "\nMH - Minutes to hours"
				+ "\nHD - Hours to days");
		convert = userInput.next();
		
		if (convert.equalsIgnoreCase("hm")) {
			HM();
		}
		else if (convert.equalsIgnoreCase("dh")) {
			DH();
		}
		else if (convert.equalsIgnoreCase("mh")) {
			MH();
		}
		else if (convert.equalsIgnoreCase("hd")){
			HD();
		}
		else {
			System.out.print("Invalid conversion type.");
		}
		
	}

}
