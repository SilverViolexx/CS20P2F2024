package Mastery;

import java.text.DecimalFormat;

public class LunchOrder {
	private double prices, fats, carbs, fibers, total;
	//Shortens number to 2 decimal places
	DecimalFormat df = new DecimalFormat("#0.00");
	
	//Constructor method with default values
	public LunchOrder() {
		prices = 0;
		fats = 0;
		carbs = 0;
		fibers = 0;
		total = 0;
	}
	
	//Overloading constructor method
	public LunchOrder(double price2, double fat2, double carb2, double fiber2) {
		prices = price2;
		fats = fat2;
		carbs = carb2;
		fibers = fiber2;
	}
	public LunchOrder(double totalAmt) {
		total = totalAmt;
	}
	
	//Access method
	public double getPrice() {
		return prices;
	}
	public double getFat() {
		return fats;
	}
	public double getCarb() {
		return carbs;
	}
	public double getFiber() {
		return fibers;
	}
	public double getTotal() {
		return total;
	}
	
	//Modifier method
	public void setPrice(double price2) {
		prices = price2;
	}
	public void setFat(double fat2) {
		fats = fat2;
	}
	public void setCarb(double carb2) {
		carbs = carb2;
	}
	public void setFiber(double fiber2) {
		fibers = fiber2;
	}
	public void setTotal(double totalAmt) {
		total = totalAmt;
	}
	
	//Return display info for menu items
	public String burgers() {
		return ("Each hamburger has " + fats + "g of fat, " + carbs + "g of carbs, and " + fibers + "g of fiber.");
	}
	public String salads() {
		return ("Each salad has " + fats + "g of fat, " + carbs + "g of carbs, and " + fibers + "g of fiber.");
	}
	public String fries() {
		return ("French fries have " + fats + "g of fat, " + carbs + "g of carbs, and " + fibers + "g of fiber.");
	}
	public String sodas() {
		return ("Each soda has " + fats + "g of fat, " + carbs + "g of carbs, and " + fibers + "g of fiber.");
	}
	
	//Calculate burger price
	public void burgerCost(int burgerAmt, double price) {
		total += (burgerAmt * price);
	}
	
	//Calculate salad price
	public void saladCost(int saladAmt, double price) {
		total += (saladAmt * price);
	}
	
	//Calculate salad price
	public void fryCost(int fryAmt, double price) {
		total += (fryAmt * price);
	}
	
	//Calculate salad price
	public void sodaCost(int sodaAmt, double price) {
		total += (sodaAmt * price);
	}
	
	//Display total price
	public String total() {
		return "Your order comes to: $" + df.format(total);
	}
}
