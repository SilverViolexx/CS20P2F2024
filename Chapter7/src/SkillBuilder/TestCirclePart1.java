package SkillBuilder;

import java.text.DecimalFormat;

public class TestCirclePart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#0.00");
		
		CirclesPart1 spot = new CirclesPart1();
		 spot.setRadius(3);
		 System.out.println("Circle radius: " + spot.getRadius());
		 System.out.println("Circle circumference: " + df.format(spot.circumference()));
		
	}
	
}
