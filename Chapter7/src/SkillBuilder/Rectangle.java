package SkillBuilder;

public class Rectangle {
	private double length, width;
	
	//Constructor method
	public Rectangle() {
		length = 2; //Default length
		width = 4; //Default width
	}
	
	//Overloading constructor method
	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}
	
	//Access method
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	//Modifier method
	public void setLW(double l, double w) {
		length = l;
		width = w;
	}
	
	//Area calculation
	public double area() {
		return (getLength() * getWidth());
	}
	
	//Perimeter calculation
	public double perimeter() {
		return ((2 * getLength()) + (2 * getWidth()));
		}

	//Area formula
	public static void displayAreaFormula() {
		System.out.println("The formula for the area of a rectangle is a = (2 * l) + (2 * w).");
	}
}
