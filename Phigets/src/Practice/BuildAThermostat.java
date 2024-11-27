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
	//Global variable
	public static int temperature = 21;
	public static void main(String[] args) throws Exception 
	{
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
		
		//Runs code when data input from red button changes
		redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
			public void onStateChange(DigitalInputStateChangeEvent e) {
				//Decreases temperature by 1°C
				if (e.getState() == true)
				{
					temperature--;
					System.out.println("Temperature decreased by 1°C");
				}
			}
		});
		
		//Runs code when data input from green button changes
		greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
			public void onStateChange(DigitalInputStateChangeEvent f) {
				//Increases temperature by 1°C
				if (f.getState() == true)
				{
					temperature++;
					System.out.println("Temperature increased by 1°C");
				}
			}
		});
		
		//Connect program to device
		redButton.open(1000);
		redLED.open(1000);
		greenButton.open(1000);
		greenLED.open(1000);
		
		
		//Loop keeps code running
		while (true) 
		{
			//Display set temperature
			System.out.println("Current temperature: " + temperature + "°C");			
			
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
			
			Thread.sleep(10000);
		}
		
		

		
		
	}
}
