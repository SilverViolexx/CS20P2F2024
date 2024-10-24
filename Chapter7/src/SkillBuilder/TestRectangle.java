package SkillBuilder;

import java.text.DecimalFormat;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#0.00");
		
		Rectangle rect = new Rectangle();
		rect.setLW(5.2,7);
		Rectangle rect2 = new Rectangle(3,6);
		
		System.out.println("Rectangle perimeter: " + rect.perimeter());
		System.out.println("Rectangle area: " + rect.area());
		Rectangle.displayAreaFormula();
		
		if (rect.equals(rect2)) {
			System.out.println("The circles are equal.");
		}
		else {
			System.out.println("The circles are not equal.");
		}
		
		
		System.out.println(rect2.toString());
	}

}
