/*
Program: EvensAndOdds.java          Last Date of this Revision: November 18, 2024

Purpose: Create an EvensAndOdds application that generates 25 random integers between 0 and 99 and then 
displays all the evens on one line and all the odds on the next line

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20
 
*/

package Mastery;

import java.util.Random;
import java.util.ArrayList;

public class EvensAndOdds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration area
		int ranNum;
		ArrayList<Integer> evens = new ArrayList<Integer>();
		ArrayList<Integer> odds = new ArrayList<Integer>();
		
		//Preparing to import random number
		Random r = new Random();
		
		//Loops 25 times, adding each random number to either the odd or even array list
		for (int count = 0; count < 25; count++) {
		ranNum = r.nextInt(0,100);
			if ((ranNum % 2) != 0) {
				odds.add(ranNum);
			}
			else {
				evens.add(ranNum);
			}
		}
		
		//Display each element in odds array list
		System.out.println("Odds:");
		for (int element : odds) {
			System.out.print(element + " ");
		}
		
		//Display each element in evens array list
		System.out.println("\nEvens:");
		for (int element : evens) {
			System.out.print(element + " ");
		}
		
	}

}

/*
Odds:
41 79 87 13 85 65 43 93 7 1 
Evens:
8 6 98 4 58 64 60 52 80 80 38 24 12 12 90 

Odds:
65 31 29 69 95 63 87 25 13 95 11 21 25 95 
Evens:
64 88 52 92 70 20 80 56 14 26 2 
*/
