package SkillBuilder;

public class RectanglePart1 {
	private double length, width;
	
	//Constructor method
	public RectanglePart1() {
		length = 2; //Default length
		width = 4; //Default width
	}
	
	//Overloading constructor method
	public RectanglePart1(double l, double w) {
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

}
