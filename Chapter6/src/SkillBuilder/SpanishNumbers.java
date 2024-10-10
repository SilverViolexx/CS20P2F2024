package SkillBuilder;

public class SpanishNumbers {

	public static void spanish(int number) {
		switch(number) {
			case 1: System.out.println("1 - uno");
				break;
			case 2: System.out.println("2 - dos");
				break;
			case 3: System.out.println("3 - tres");
				break;
			case 4: System.out.println("4 - cuatro");
				break;
			case 5: System.out.println("5 - cinco");
				break;
			case 6: System.out.println("6 - seis");
				break;
			case 7: System.out.println("7 - seite");
				break;
			case 8: System.out.println("8 - ocho");
				break;
			case 9: System.out.println("9 - nueve");
				break;
			case 10: System.out.println("10 - diez");
				break;
			default: System.out.println("Invalid");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		while (number < 10) {
			number ++;
			spanish(number);
		}
		
		
	}

}
