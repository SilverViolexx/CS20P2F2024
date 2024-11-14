package SkillBuilder;

import java.util.Scanner;

public class StudentRoster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration area
		int studentNum, i;
		String names;
		
		//Prepare for user input
		Scanner userInput = new Scanner(System.in);
		
		//Prompt user
		System.out.print("How many students are there: ");
		studentNum = userInput.nextInt();
		
		//Declare array
		String[] roster = new String[studentNum];
		
		for (i = 0; i < studentNum; i++) {
			System.out.print("Please enter their name: ");
			names = userInput.next();
			roster[i] = names;
		}
		
		System.out.println("Student Roster:");
		for (String element : roster) {
			System.out.println(element);
		}
		
	}

}
