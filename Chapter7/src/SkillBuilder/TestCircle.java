package SkillBuilder;

import java.text.DecimalFormat;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#0.00");
		
		Circles spot = new Circles();
		Circles spot2 = new Circles(2.3);
		spot.setRadius(2);
		System.out.println("Circle radius: " + spot.getRadius());
		System.out.println("Circle circumference: " + df.format(spot.circumference()));
		Circles.displayAreaFormula();
		
		if (spot.equals(spot2)) {
			System.out.println("The circles are equal.");
		}
		else {
			System.out.println("The circles are not equal.");
		}
		
		
		System.out.println(spot.toString());
		
	}
	
}
