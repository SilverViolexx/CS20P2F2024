package Mastery;

public class DigitExtractor {
	private int hundred, ten, one;
	
	//Constructor method with default values
	public DigitExtractor() {
		hundred = 0;
		ten = 0;
		one = 0;
	}
	
	//Overloading constructor method
	public DigitExtractor(int h, int t, int o) {
		hundred = h;
		ten = t;
		one = o;
	}
	
	//Access method
	public int getHundred() {
		return hundred;
	}
	public int getTen() {
		return ten;
	}
	public int getOne() {
		return one;
	}
	
	//Modifier method
	public void setHundred(int h) {
		hundred = h;
	}
	public void setTen(int t) {
		ten = t;
	}
	public void setOne(int o) {
		one = o;
	}
	
	//Show whole number
	public String showNum(int userNum) {
		return ("The whole number is " + userNum + ".");
	}
	
	//Find hundreds place
	public String getHundreds(int userNum) {
		hundred = userNum / 100;
		return ("The hundreds place digit is " + hundred + ".");
	}
		
	//Find tens place
	public String getTens(int userNum) {
		hundred = userNum / 100;
		ten = (userNum - (hundred * 100)) / 10;
		return ("The tens place digit is " + ten + ".");
	}
		
	//Find ones place
	public String getOnes(int userNum) {
		hundred = userNum / 100;
		ten = (userNum - (hundred * 100)) / 10;
		one = userNum - ((hundred * 100) + (ten * 10));
		return ("The ones place digit is " + one + ".");
	}
}
