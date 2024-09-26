import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		int age = userInput.nextInt();
		if (age <= 18) { 
			System.out.println("child"); } 
			else if (age < 65) { 
			System.out.println("adult"); }
			 else if (age >= 65) { 
			System.out.println("senior"); }

			}
		
	}


