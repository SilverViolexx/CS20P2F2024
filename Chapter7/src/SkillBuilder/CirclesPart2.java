package SkillBuilder;

public class CirclesPart2{
	private double radius;
	private static double PI = 3.14;
	
	//Constructor method
	public CirclesPart2() {
		radius = 1.5; //Default radius
		
	}
	
	//Overloading the constructor method
	public CirclesPart2(double r) {
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
	
	public double circumference() {
		return (2 * PI * getRadius());
	}
	
}

