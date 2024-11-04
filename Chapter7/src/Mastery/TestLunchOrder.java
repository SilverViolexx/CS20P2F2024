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
		LunchOrder totalAmt = new LunchOrder(0);
		LunchOrder burgerInfo = new LunchOrder(1.85, 9, 33, 1);
		LunchOrder saladInfo = new LunchOrder(2, 1, 11, 5);
		LunchOrder friesInfo = new LunchOrder(1.3, 11, 36, 4);
		LunchOrder sodaInfo = new LunchOrder(0.95, 0, 38, 0);
		
		//Prompt user to input an integer for each item and initialize it
		System.out.print("Enter number of hamburgers: ");
		burgerAmt = userInput.nextInt();
		System.out.println(burgerInfo.burgers());
		totalAmt.burgerCost(burgerAmt, burgerInfo.getPrice());
		
		
		System.out.print("Enter number of salads: ");
		saladAmt = userInput.nextInt();
		System.out.println(saladInfo.salads());
		totalAmt.saladCost(saladAmt, saladInfo.getPrice());
		
		System.out.print("Enter number of fries: ");
		fryAmt = userInput.nextInt();
		System.out.println(friesInfo.fries());
		totalAmt.fryCost(fryAmt, friesInfo.getPrice());
		
		System.out.print("Enter number of sodas: ");
		sodaAmt = userInput.nextInt();
		System.out.println(sodaInfo.sodas());
		totalAmt.sodaCost(sodaAmt, sodaInfo.getPrice());
		
		//Display total
		System.out.println(totalAmt.total());
	}

}

/*
Enter number of hamburgers: 1
Each hamburger has 9.0g of fat, 33.0g of carbs, and 1.0g of fiber.
Enter number of salads: 1
Each salad has 1.0g of fat, 11.0g of carbs, and 5.0g of fiber.
Enter number of fries: 1
French fries have 11.0g of fat, 36.0g of carbs, and 4.0g of fiber.
Enter number of sodas: 1
Each soda has 0.0g of fat, 38.0g of carbs, and 0.0g of fiber.
Your order comes to: $6.10

Enter number of hamburgers: 0
Each hamburger has 9.0g of fat, 33.0g of carbs, and 1.0g of fiber.
Enter number of salads: 5
Each salad has 1.0g of fat, 11.0g of carbs, and 5.0g of fiber.
Enter number of fries: 2
French fries have 11.0g of fat, 36.0g of carbs, and 4.0g of fiber.
Enter number of sodas: 1
Each soda has 0.0g of fat, 38.0g of carbs, and 0.0g of fiber.
Your order comes to: $13.55
*/
