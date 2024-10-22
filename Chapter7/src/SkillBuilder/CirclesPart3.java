package SkillBuilder;

public class CirclesPart3{
	private double radius;
	private static double PI = 3.14;
	
	//Constructor method
	public CirclesPart3() {
		radius = 1.5; //Default radius
		
	}
	
	//Overloading the constructor method
	public CirclesPart3(double r) {
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
}

