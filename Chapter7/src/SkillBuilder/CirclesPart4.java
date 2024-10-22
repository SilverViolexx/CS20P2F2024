package SkillBuilder;

public class CirclesPart4{
	private double radius;
	private static double PI = 3.14;
	
	//Constructor method
	public CirclesPart4() {
		radius = 1.5; //Default radius
		
	}
	
	//Overloading the constructor method
	public CirclesPart4(double r) {
		radius = r;
	}

	//Access method
	public double getRadius(){
		return radius;
	}
	
	//Modifier method
	public void setRadius(double r){
		radius = r;
	}
	
	//Circumference calculation
	public double circumference() {
		return (2 * PI * getRadius());
	}
	
	//Area formula
	public static void displayAreaFormula() {
		System.out.println("The formula for the area of a circle is a = PI * r * r.");
	}
	
	public boolean equals(CirclesPart4 spot) {
		CirclesPart4 same = (CirclesPart4) spot;
				
		if (same.getRadius() == radius) {
			return true;
		}
		else {
			return false;
		}
	}
	
}

