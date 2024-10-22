package SkillBuilder;

import java.text.DecimalFormat;

public class TestCirclePart3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#0.00");
		
		CirclesPart4 spot = new CirclesPart4();
		spot.setRadius(3);
		System.out.println("Circle radius: " + spot.getRadius());
		System.out.println("Circle circumference: " + df.format(spot.circumference()));
		CirclesPart3.displayAreaFormula();
	}
	
}
