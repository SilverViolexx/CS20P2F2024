package Mastery;

import java.text.DecimalFormat;

public class DigitExtractor {
	private int wholeNum, hundred, ten, one;
	
	DecimalFormat df = new DecimalFormat("#0");
	
	//Constructor method with default values
	public DigitExtractor() {
		wholeNum = 0;
		hundred = 0;
		ten = 0;
		one = 0;
	}
	
	//Overloading constructor method
	public DigitExtractor(int w, int h, int t, int o) {
		wholeNum = w;
		hundred = h;
		ten = t;
		one = o;
	}
	
	//Access method
	public int getNum() {
		return wholeNum;
	}
	
	//Modifier method
	public void setNum(int w) {
		wholeNum = w;
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
		ten = (userNum - (hundred * 100));
		int tens = userNum;
		int ten1 = hundred;
		int ten2 = hundred * 100;
		return ("The tens place digit is " + ten +"         " + tens +"         " + ten1 +"         " + ten2 +"         " + ".");
	}
		
	//Find tens place
	public String getOnes(int userNum) {
		int newTotal = userNum - (hundred * 100);
		one = newTotal - (ten * 10);
		return ("The ones place digit is " + one + ".");
	}
}
