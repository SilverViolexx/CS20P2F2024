package SkillBuilder;

public class CirclesPart1{
	private double radius;
	private static double PI = 3.14;
	
	//Constructor method
	public CirclesPart1() {
		radius = 1.5; //Default radius
		
	}

	//Accessor Method
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

