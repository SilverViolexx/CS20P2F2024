/*
Program: TugOfWar.java          Last Date of this Revision: November 25, 2024

Purpose: Create a two-player game that simulates a tug of war.

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20
 
*/
package Practice;

import com.phidget22.*;

public class TugOfWar 
{
	public static void main(String[] args) throws Exception
	{
		//Declaration area
		int redCount = 0;
		int greenCount = 0;
			
		//Create objects for red and green buttons and LEDs
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
		redButton.open(1000);
		redLED.open(1000);
		greenButton.open(1000);
		greenLED.open(1000);

		//Display player info
		System.out.println("Player 1 is red, Player 2 is green");
		
		//Countdown to start using for loop
		for (int i = 3; i > 0; i--)
		{
			System.out.println(i);
			Thread.sleep(1000);
			if (i == 1)
			{
				System.out.println("Start!");
				
			}
		}
		
		//While loop that checks button state until one of the buttons is pressed 10 times
		while (redCount < 10 && greenCount < 10){

			if(redButton.getState())
			{	
				redCount++;
			} 
			else if(greenButton.getState())
			{
				greenCount++;
			} 

			Thread.sleep(75);
		}
		
		//Flash LEDs to indicate game finished
		redLED.setState(true);
		greenLED.setState(true);
		Thread.sleep(1000);
		redLED.setState(false);
		greenLED.setState(false);
		Thread.sleep(1000);

		//If, else statement to display winner
		if (redCount == 10) 
		{
			System.out.print("Player 1 won!");
			//Flashes red LED 5 times
			for(int i = 0; i < 5; i++)
			{
				redLED.setState(true);
			    Thread.sleep(800);
			    redLED.setState(false);
			    Thread.sleep(800);
			}
		}
		else 
		{	
			System.out.print("Player 2 won!");
			//Flashes green LED 5 times
			for(int i = 0; i < 5; i++)
			{
				greenLED.setState(true);
			    Thread.sleep(800);
			    greenLED.setState(false);
			    Thread.sleep(800);
			}
		}
 
	}
}	  



