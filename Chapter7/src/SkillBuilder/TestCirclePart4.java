package SkillBuilder;

import java.text.DecimalFormat;

public class TestCirclePart4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#0.00");
		
		CirclesPart3 spot = new CirclesPart3();
		spot.setRadius(3);
		System.out.println("Circle radius: " + spot.getRadius());
		System.out.println("Circle circumference: " + df.format(spot.circumference()));
		CirclesPart3.displayAreaFormula();
		
		if (equals(spot.setRadius(3))) = true) {
			System.out.println("The circles are equal.");
		}
		else {
			System.out.println("The circles are not equal.");
		}
	}
	
}
