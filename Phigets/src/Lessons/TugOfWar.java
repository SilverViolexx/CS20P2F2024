package Lessons;

//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class TugOfWar 
{
	//Handle Exceptions | Exceptions will happen in your code from time to time. These are caused by unexpected things happening. Make sure you’ve added "throws Exception" to your main method.
	public static void main(String[] args) throws Exception
	{
		int redCount = 0;
		int greenCount = 0;
			
		//Create | Create objects for your buttons and LEDs.
		DigitalInput redButton = new DigitalInput();
		DigitalOutput redLED = new DigitalOutput();
		DigitalInput greenButton = new DigitalInput();
		DigitalOutput greenLED = new DigitalOutput();

		//Address | Address your four objects which lets your program know where to find them.
		redButton.setHubPort(0);
		redButton.setIsHubPortDevice(true);
		redLED.setHubPort(1);
		redLED.setIsHubPortDevice(true);
		greenButton.setHubPort(5);
		greenButton.setIsHubPortDevice(true);
		greenLED.setHubPort(4);
		greenLED.setIsHubPortDevice(true);

		//Open | Connect your program to your physical devices.
		redButton.open(1000);
		redLED.open(1000);
		greenButton.open(1000);
		greenLED.open(1000);

		System.out.println("Player 1 is red, Player 2 is green");
		
		//Use your Phidgets | This code will turn on the LED when the matching button is pressed and turns off the LED when the matching button is released. The sleep function slows down the loop so the button state is only checked every 150ms.
		while (redCount < 10 && greenCount < 10){

			if(redButton.getState())
			{
				redLED.setState(true);
				redCount++;
			} 
			else {
				redLED.setState(false);
			}

			if(greenButton.getState())
			{
				greenLED.setState(true);
				greenCount++;
			} 
			else 
			{
				greenLED.setState(false);
			}

			Thread.sleep(100);
		}
		
		redLED.setState(true);
		greenLED.setState(true);
		Thread.sleep(1000);
		redLED.setState(false);
		greenLED.setState(false);
		Thread.sleep(1000);

		if (redCount == 10) 
		{
			for(int i = 0; i < 5; i++)
			{
				redLED.setState(true);
			    Thread.sleep(800);
			    redLED.setState(false);
			    Thread.sleep(800);
			}
			System.out.print("Player 1 won!");
		}
		else 
		{	
			for(int i = 0; i < 5; i++)
			{
				greenLED.setState(true);
			    Thread.sleep(800);
			    greenLED.setState(false);
			    Thread.sleep(800);
			}
			System.out.print("Player 2 won!");
		}
		
		    
	}

}	  



