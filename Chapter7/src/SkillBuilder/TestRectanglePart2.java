package SkillBuilder;

import java.text.DecimalFormat;

public class TestRectanglePart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#0.00");
		
		RectanglePart2 rect = new RectanglePart2();
		rect.setLW(5.2,7);
		
		System.out.println("Rectangle perimeter: " + rect.perimeter());
		System.out.println("Rectangle area: " + rect.area());
		RectanglePart2.displayAreaFormula();
	}

}
