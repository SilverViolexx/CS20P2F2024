package Practice;


import java.util.Scanner;

//Add Phidgets Library
import com.phidget22.*;

public class AdvancedLessons {
	public static String answer;
	public static boolean turnRedLEDOn = false;
  
  public static void main(String[] args) throws Exception {

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
		
      //Temperature Event |  Event code runs when data input from the sensor changes. The following event is a Temperature change event. The contained code will only run when the temperature input changes.
      temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
          public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
        	  if (e.getTemperature() >= 25) 
        	  {
        	  System.out.println("The temperature is " + e.getTemperature() + "°C");
        	  redLED.setDutyCycle(0.1);
        	  }
        	  else if (e.getTemperature() >= 30) 
        	  {
        	  System.out.println("The temperature is " + e.getTemperature() + "°C");
        	  redLED.setDutyCycle(0.5);
        	  }
        	  else if (e.getTemperature() >= 35) 
        	  {
        	  System.out.println("The temperature is " + e.getTemperature() + "°C");
        	  redLED.setDutyCycle(1);
        	  }
          }
      });
      
      //Detach Event 
      temperatureSensor.addDetachListener(new DetachListener() {
          public void onDetach(DetachEvent e) {
        	  Scanner userInput = new Scanner(System.in);
        	  
        	  //Prompt user
        	  System.out.println("Temperature sensor has been detached!"
              		+ "\nAre you sure? (Y/N)");
              answer = userInput.nextLine();
          }
      });
      
      redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
          public void onStateChange(DigitalInputStateChangeEvent e) {
              System.out.println("State: " + e.getState());
          }
      });

      //Open
      temperatureSensor.open(5000);
      redButton.open(1000);
      redLED.open(1000);
      greenButton.open(1000);
      greenLED.open(1000);

      //Set Data Interval | The Data Interval controls how often the program collects data from your Phidget. The Data Interval ranges from 500 ms - 60000 ms.
      temperatureSensor.setDataInterval(1000);

      //Keep program running
      while (true) {
    	  temperatureSensor.setDataInterval(1000);
    	  
 
    	  
    	  if (answer.equalsIgnoreCase("y"))
          {
        	  temperatureSensor.close();
          }
          Thread.sleep(150);
      }
  }
}
