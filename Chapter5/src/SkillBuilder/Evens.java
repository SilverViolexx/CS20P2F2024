/*

Program: Evens.java          Last Date of this Revision: October 1, 2024

Purpose: Create an Evens application that displays the even numbers between 1 and 20, inclusive.

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20
 
*/
package SkillBuilder;

public class Evens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	for (int i = 1; i <= 20; i +=1) {
		if (i % 2 == 0) {
			System.out.println(i);
		}
	}
	}

}
