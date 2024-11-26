/*
Program: HotOrCold.java          Last Date of this Revision: November 25, 2024

Purpose: Create a temperature indicator using your Smart Phidget and LEDs.

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20
 
*/
package Practice;

import com.phidget22.*;

public class HotOrCold 
{

	public static void main(String[] args) throws Exception 
	{
	
	    //Create a temperature sensor object
		TemperatureSensor temperatureSensor = new TemperatureSensor();
	      
		//Create objects for red and green LEDs
		DigitalOutput redLED = new DigitalOutput();
		DigitalOutput greenLED = new DigitalOutput();
	      
		//Address objects
		redLED.setHubPort(1);
		redLED.setIsHubPortDevice(true);
		greenLED.setHubPort(4);
		greenLED.setIsHubPortDevice(true);
	      
		//Connect program to device
		redLED.open(1000);
		greenLED.open(1000);
		temperatureSensor.open(1000);
	      
		//If, else statement to see if the temperature is between a range
		if (temperatureSensor.getTemperature() >= 20 && temperatureSensor.getTemperature() <= 24) 
		{
			//Flash green LED if between range
			greenLED.setState(true);
			Thread.sleep(2500);
			greenLED.setState(false);
			Thread.sleep(1000);
		}
		else 
		{
			//Flash red LED if outside of range
			greenLED.setState(true);
			Thread.sleep(2500);
			greenLED.setState(false);
			Thread.sleep(1000);
		}
	    
		//Display temperature to user
		System.out.print("The temperature is: " + temperatureSensor.getTemperature() + "°C");
	      
	      
	}
}