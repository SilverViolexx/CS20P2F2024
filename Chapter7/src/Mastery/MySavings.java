package Mastery;

public class MySavings {
	private double total;
	
	//Constructor method with default values
	public MySavings() {
		total = 0;
	}
	
	//Overloading constructor method
	public MySavings(double t) {
		total = t;
	}
	
	//Access method
	public double getTotal() {
		return total;
	}
	
	//Modifier method
	public void setTotal(double t) {
		total = t;
	}
	
	//Show total
	public String showTotal() {
		return ("Your total balance is: $" + total);
	}
	
	//Add pennies
	public void addPennies() {
		double total =+ 0.01;
		
	}
	
	//Add nickels
	public void addNickels() {
		double total = 0.05;
	}
	
	//Add dimes
	public void addDimes() {
		double total =+ 0.1;
	}
	
	//Add quarters
	public void addQuarters() {
		double total =+ 0.25;
	}
	
	//Subtract money
	public String takeMoney(double newTotal) {
		total =- newTotal;
		return("Your new balance is: $" + total);
	}

	//Take out money
	//public double totalAfter(double takeOut) {
		
	
}