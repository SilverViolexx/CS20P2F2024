/*
Program: BuildAThermostat.java          Last Date of this Revision: November 26, 2024

Purpose: Create a simulated thermostat using your Humidity Phidget, push buttons and LEDs.

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20
 
*/
package Practice;

import com.phidget22.*;

public class BuildAThermostat 
{
	public static void main(String[] args) throws Exception 
	{
		//Declaration area
		int temperature = 21;
		
		
	    //Create a temperature sensor object
		//TemperatureSensor temperatureSensor = new TemperatureSensor();
		
		//Create objects for red and green buttons
		DigitalInput redButton = new DigitalInput();
		DigitalOutput redLED = new DigitalOutput();
		DigitalInput greenButton = new DigitalInput();
		DigitalOutput greenLED = new DigitalOutput();
		
		//Address objects
		redButton.setHubPort(0);
		redButton.setIsHubPortDevice(true);
		redLED.setHubPort(1);
		redLED.setIsHubPortDevice(true);
		greenButton.setHubPort(5);
		greenButton.setIsHubPortDevice(true);
		greenLED.setHubPort(4);
		greenLED.setIsHubPortDevice(true);
		
		//Connect program to device
		//temperatureSensor.open(1000);
		redButton.open(1000);
		redLED.open(1000);
		greenButton.open(1000);
		greenLED.open(1000);
		
		//Set default temperature
		
		while (true) 
		{
		
			//Display set temperature
			
			System.out.println("Current temperature: " + temperature + "°C");
			
			}
			
			//Increases temperature by 1°C
			if(greenButton.getState())
			{
				temperature++;
				System.out.println("Temperature increased by 1°C");
			} 	
			//Decreases temperature by 1°C
			else if(redButton.getState())
			{
				temperature--;
				System.out.println("Temperature decreased by 1°C");
			} 
			
			
			//Changes LED colour depending on range within temperature
			if (temperature <= 23 && temperature >= 19)
			{
				greenLED.setState(true);
				redLED.setState(false);
			}
			else
			{
				redLED.setState(true);
				greenLED.setState(false);
			}
			
			}
		}
		
		

		
		
	}
}
