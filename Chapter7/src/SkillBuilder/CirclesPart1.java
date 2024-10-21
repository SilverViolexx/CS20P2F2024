package SkillBuilder;

public class CirclesPart1 {

	public class Circle{
		private double radius;
		private static double PI = 3.14;
	
	
		public Circle() {
			radius = 1; //Default radius
		}
		
		public Circle(double r) {
			radius = r;
		}
		
		public void setRadius(double r) {
			radius = r;
		}
		
		public double getRadius(){
			return radius;
		}
	
		public double circumference() {
			return(2 * PI * getRadius());
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle spot = new Circle();
		spot.setRadius(3);
		System.out.println("Circle radius: " + spot.getRadius());
		System.out.println("Circle circumference: " + spot.circumference());
	}

}
}
