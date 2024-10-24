package Mastery;

public class MySavings {
	private int pennies, nickels, dimes, quarters;
	private double total;
	
	//Constructor method with default values
	public MySavings() {
		pennies = 0;
		nickels = 0;
		dimes = 0;
		quarters = 0;
		total = 0;
	}
	
	//Overloading constructor method
	public MySavings(int p, int n, int d, int q) {
		pennies = p;
		nickels = n;
		dimes = d;
		quarters = q;
	}
	public MySavings(double t) {
		total = t;
	}
	
	//Access method
	public int getPennies() {
		return pennies;
	}
	public int getNickels() {
		return nickels;
	}
	public int getDimes() {
		return dimes;
	}
	public int getQuarters() {
		return quarters;
	}
	public double getTotal() {
		return total;
	}
	
	//Modifier method
	public void setPennies(int p) {
		pennies = p;
	}
	public void setNickels(int n) {
		nickels = n;
	}
	public void setDimes(int d) {
		dimes = d;
	}
	public void setQuarters(int q) {
		quarters = q;
	}
	public void setTotal(double t) {
		total = t;
	}
	
	//Add pennies
	public void addPennies(int penny) {
		double addPenny = penny * 0.01;
		double total =+ addPenny;
	}
	
	//Add nickels
	public void addNickels(int nickel) {
		double addNickel = nickel * 0.05;
		double total =+ addNickel;
	}
	
	//Add dimes
	public void addDimes(int dime) {
		double addDime = dimes * 0.05;
		double total =+ addDime;
	}
	
	//Add quarters
	public void addQuarters(int quarter) {
		double addQuarter = dimes * 0.05;
		double total =+ addQuarter;
	}

	//Take out money
	public double totalAfter(double takeOut) {
		
	}
}
