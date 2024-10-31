package Mastery;

import java.util.Scanner;

public class TestLunchOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration area
		int burgerAmt, saladAmt, fryAmt, sodaAmt;
		
		//Prepare for user input
		Scanner userInput = new Scanner(System.in);
		
		//Create new objects
		LunchOrder burgerInfo = new LunchOrder(1.85, 9, 33, 1);
		LunchOrder saladInfo = new LunchOrder(2, 1, 11, 5);
		LunchOrder friesInfo = new LunchOrder(1.3, 11, 36, 4);
		LunchOrder sodaInfo = new LunchOrder(0.95, 0, 38, 0);
		
		//Prompt user to input an integer an initialize it
		System.out.print("Enter number of hamburgers: ");
		burgerAmt = userInput.nextInt();
		System.out.println(burgerInfo.burgers());
		
		System.out.print("Enter number of salads: ");
		saladAmt = userInput.nextInt();
		System.out.println(saladInfo.salads());
		
		System.out.print("Enter number of fries: ");
		fryAmt = userInput.nextInt();
		System.out.println(friesInfo.fries());
		
		System.out.print("Enter number of sodas: ");
		sodaAmt = userInput.nextInt();
		System.out.println(sodaInfo.sodas());
	}

}
