package Mastery;

public class LunchOrder {
	private double prices, fats, carbs, fibers;
	
	//Constructor method with default values
	public LunchOrder() {
		prices = 0;
		fats = 0;
		carbs = 0;
		fibers = 0;
	}
	
	//Overloading constructor method
	public LunchOrder(double price2, double fat2, double carb2, double fiber2) {
		prices = price2;
		fats = fat2;
		carbs = carb2;
		fibers = fiber2;
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
	
	//Return display info for menu items
	public String burgers() {
		return ("Each hanburger has " + fats + "g of fat, " + carbs + "g of carbs, and " + fibers + "g of fiber.");
	}
	public String salads() {
		return ("Each salad has " + fats + "g of fat, " + carbs + "g of carbs, and " + fibers + "g of fiber.");
	}
	public String fries() {
		return ("Frensh fires have " + fats + "g of fat, " + carbs + "g of carbs, and " + fibers + "g of fiber.");
	}
	public String sodas() {
		return ("Each soda has " + fats + "g of fat, " + carbs + "g of carbs, and " + fibers + "g of fiber.");
	}
	
	//Calculate burger price
	public void burgerCost(int burgerAmt, double price) {
		double cost = burgerAmt * price;
	}
	
	//Calculate salad price
	public double saladCost(int saladAmt, double price) {
		double cost = saladAmt * price;
		return cost;
	}
	
	//Calculate salad price
	public double fryCost(int fryAmt, double price) {
		double cost = fryAmt * price;
		return cost;
	}
	
	//Calculate salad price
	public void sodaCost(int sodaAmt, double price) {
		double cost = sodaAmt * price;
	}
	
	//Calculate total price
	public String total() {
		double totalCost = saladCost();
	}
}
