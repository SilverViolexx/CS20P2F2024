package SkillBuilder;

import java.text.DecimalFormat;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#0.00");
		
		Rectangle rect = new Rectangle();
		rect.setLW(5.2,7);
		
		System.out.println("Rectangle perimeter: " + rect.perimeter());
		System.out.println("Rectangle area: " + rect.area());
		Rectangle.displayAreaFormula();
	}

}
