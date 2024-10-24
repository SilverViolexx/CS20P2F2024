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
		System.out.println("The formula for the area of a rectangle is a = (2 * length) + (2 * width).");
	}
	
	//Compares if 2 rectangles are equal
	public boolean sameRectangle(Object rect) {
		Rectangle same = (Rectangle) rect;
		
		if (same.getLength() == ((Rectangle) rect).getLength() & same.getWidth() == ((Rectangle) rect).getWidth()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Returns a string that represents the circle
		public String toString() {
			String retangleString;
			
			retangleString = "The second circle has a length of " + getLength() + " and a width of " + getWidth() + ".";
			return (retangleString);
		}
}
