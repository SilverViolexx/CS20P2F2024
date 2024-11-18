package SkillBuilder;

import java.util.Scanner;

public class CountLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration area
		String phrase;
		int offset;  //array index
		final int LOW = 'A';
		final int HIGH = 'Z';
		int[] letterCount = new int[HIGH - LOW + 1];
		char[] wordLetter;
		
		//Prepare for user input
		Scanner userInput = new Scanner(System.in);
		
		//Prompt user
		System.out.println("Please enter a phrase (Note that only letters are counted):");
		phrase = userInput.nextLine();
		
		//Removing spaces and punctuation
		phrase = phrase.replaceAll("\\W", "");
		System.out.println(phrase);

		//Separates characters
		phrase = phrase.toUpperCase();
		wordLetter = phrase.toCharArray();
		
		
		for (int letter = 0; letter < wordLetter.length; letter++) {
			offset = wordLetter[letter] - LOW; 
			letterCount[offset] += 1;
		}
		
		for (int i = LOW; i <= HIGH; i++) {
			System.out.println((char)i + ": " + letterCount[i - LOW]);
		}
		
		
	}

}
