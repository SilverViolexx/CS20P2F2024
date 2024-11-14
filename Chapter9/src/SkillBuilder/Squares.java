package SkillBuilder;

import java.util.Scanner;

public class Squares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration area
		int element, i;
		int[] square = new int[5];
		
		//Prepare for user input
		Scanner userInput = new Scanner(System.in);
		
		//Prompt user
		for (i = 0; i < 5; i++) {
			System.out.print("Please enter an integer: ");
			element = userInput.nextInt();
			element = (int) Math.pow(element, 2);
			square[i] = element;
		}
		
		//Display answer
		System.out.println("Squares:");
		for (int element1 : square) {
			System.out.println(element1);
		}
		
	}

}
