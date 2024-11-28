/*
Program: AdvancedLessons.java          Last Date of this Revision: November 27, 2024

Purpose: Create a game that allows you to interact with the cat using the red and green button. Program checks for overheating.

Author: Amanda Ly
School: CHHS
Course: Computer Programming 20
 
*/
package Practice;

//Add Phidgets Library
import com.phidget22.*;

public class AdvancedLessons {
	public static int health = 2;
	public static boolean redChange = false;
	public static boolean greenChange = false;

public static void main(String[] args) throws Exception {
	  //Declaration and initialization area
	  int warning1 = 0;
	  int warning2 = 0;
	  
	  //For test warning code
	  int warning = 0;

    //Create
    TemperatureSensor temperatureSensor = new TemperatureSensor();
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
    temperatureSensor.setHubPort(2);
    
    //Detach Event 
    temperatureSensor.addDetachListener(new DetachListener() 
    {
        public void onDetach(DetachEvent e) 
        {
      	//Prompt user
      	  System.out.println("Phiget has been detached!"
            		+ "\nDisconnecting the phiget will end the program. Good bye.");
        }
    });
    
    //Runs code when data input from red button changes
    redButton.addStateChangeListener(new DigitalInputStateChangeListener() 
    {
        public void onStateChange(DigitalInputStateChangeEvent e)
        {
        	redChange = true;
        }
    });
    
    //Runs code when data input from green button changes
    greenButton.addStateChangeListener(new DigitalInputStateChangeListener() 
    {
        public void onStateChange(DigitalInputStateChangeEvent e) 
        {  
        	greenChange = true;
        }
    });

    //Open
    temperatureSensor.open(5000);
    redButton.open(1000);
    redLED.open(1000);
    greenButton.open(1000);
    greenLED.open(1000);

    //Set data interval
    temperatureSensor.setDataInterval(1000);

    //Prompt user
    System.out.print("Press the buttons to interact with the cat."
			  + "\n🐈"
			  + "\n❤️❤️");
    
    //Keeps program running
    while (true) 
    {
  	  //Runs when red button pressed
  	  if (redButton.getState())
  	  {
      	  health--;
      	
      	  //Display message
            System.out.print("\nYou have hit the cat."
            		+ "\n🐈"
            		+ "\n");
            
            //Displays heart for each health point it has
            for (int i = 0; i < health; i++)
            {
          	  System.out.print("❤️");
            }
            Thread.sleep(500);
            
            //Runs when health reaches 0
            if (health == 0)
      	  {
          	  //Display message
      		  System.out.println("\nYou have killed the cat.☠️");
      		  //Flashes red LED 3 times
      		  for (int i = 0; i < 3; i++)
      		  {
      			  redLED.setState(redChange);
      			  Thread.sleep(800);
      			  redLED.setState(false);
      			  Thread.sleep(800);
      			  
      		  }
      		  break;
      		  
      	  }
  	  }
  	  
  	  //Runs when green button pressed
  	  else if (greenButton.getState())
  	  {
      	  health++;
      	  
      	  //Display message
            System.out.print("\nYou have pet the cat."
            		+ "\n🐈"
            		+ "\n");
            
            //Displays heart for each health point it has
            for (int i = 0; i < health; i++)
            {
          	  System.out.print("❤️");
            }
            Thread.sleep(500);
            
            if (health == 5)
      	  {
          	  //Display message
      		  System.out.println("\nThe cat loves you.😺");
      		  //Flashes green LED 3 times
      		  for (int i = 0; i < 3; i++)
      		  {
      			  greenLED.setState(greenChange);
      			  Thread.sleep(800);
      			  greenLED.setState(false);
      			  Thread.sleep(800);
      		  }
      		  break;
      	  }
  	  }
  	  
  	  
  	  
  	  
  	  
  	  //Test warning code
  	  int temp = 45;
  	  if (temp >= 25) 
  	  {
  		if (warning < 1)
		  {
			  System.out.println("\nThe temperature is hot: " + temperatureSensor.getTemperature() + "°C");
			  //Flashes weak red LED
			  redLED.setDutyCycle(0.1);
			  Thread.sleep(3000);
			  redLED.setState(false);
			  
		  }
		  warning++;
  	  }
  	  //
  	  
  	  /*Warning for overheating
  	  if (temperatureSensor.getTemperature() >= 29) 
  	  {
  		  //Displays warning once
  		  if (warning1 < 1)
  		  {
  			  System.out.println("\nThe temperature is hot: " + temperatureSensor.getTemperature() + "°C");
  			  //Flashes weak red LED
  			  redLED.setDutyCycle(0.1);
  			  Thread.sleep(3000);
  			  redLED.setState(false);
  		  }
  		  warning1++;
  	  }
  	  */
  	  if (temperatureSensor.getTemperature() >= 35) 
  	  {
  		//Displays warning once
  		  if (warning2 < 1)
  		  {
  			  System.out.println("\nThe temperature is very hot: " + temperatureSensor.getTemperature() + "°C");
  			  //Flashes stronger red LED
  			  redLED.setDutyCycle(0.5);
  			  Thread.sleep(3000);
  			  redLED.setState(false);
  		  }
  		  warning2++;
  	  }
  	  if (temperatureSensor.getTemperature() >= 40) 
  	  {
  		  System.out.println("\nThe temperature is too hot: " + temperatureSensor.getTemperature() + "°C"
  				  + "\nPlease turn off device");
  		  //Flashes red LED
  		  redLED.setDutyCycle(1);
  		  Thread.sleep(3000);
			  redLED.setState(false);
  		  break;
  	  }
        
    }
    
    temperatureSensor.close();
	  redButton.close();
    redLED.close();
    greenButton.close();
    greenLED.close();
    
}
}
