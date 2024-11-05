package Mastery;

import java.text.DecimalFormat;

public class MySavings {
	private double total;
	
	//Shortens number to 2 decimal places
	DecimalFormat df = new DecimalFormat("#0.00");
	
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
		total += t;
	}
	
	//Add coins
	public void addPennies() {
		total = total + 0.01;
	}
	public void addNickels() {
		total = total + 0.05;
	}
	public void addDimes() {
		total = total + 0.1;
	}
	public void addQuarters() {
		total = total + 0.25;
	}
	
	//Show total
	public String showTotal() {
		return ("Your total balance is: $" + df.format(getTotal()));
	}
	
	//Subtract money
	public String takeMoney(double newTotal) {
		total -= newTotal;
		return("Your new balance is: $" + df.format(total));
	}

		
	
}
