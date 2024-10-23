package SkillBuilder;

public class Circles{
	private double radius;
	private static double PI = 3.14;
	
	//Constructor method
	public Circles() {
		radius = 1.5; //Default radius
		
	}
	
	//Overloading the constructor method
	public Circles(double r) {
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
		System.out.println("The formula for the area of a circle is a = PI * radius * radius.");
	}
	
	public boolean sameRadius(Object spot) {
		Circles same = (Circles) spot;
				
		if (same.getRadius() == radius) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		String circleString;
		
		circleString = "The first circle has a radius of " + radius + ".";
		return (circleString);
	}
	
}

