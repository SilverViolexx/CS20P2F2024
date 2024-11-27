package AdvancedLesson;

//Add Phidgets Library
import com.phidget22.*;

public class AttachEvents {
	//Turn on/off LEDs with Global Variables
	  static boolean turnRedLEDOn = false;
	  static boolean turnGreenLEDOn = false;
	  
  public static void main(String[] args) throws Exception {
     
      //Create
      TemperatureSensor temperatureSensor = new TemperatureSensor();
      DigitalInput redButton = new DigitalInput();
      DigitalInput greenButton = new DigitalInput();
      DigitalOutput redLED = new DigitalOutput();
      DigitalOutput greenLED = new DigitalOutput();

      //Address
      redButton.setHubPort(0);
      redButton.setIsHubPortDevice(true);
      greenButton.setHubPort(5);
      greenButton.setIsHubPortDevice(true);
      redLED.setHubPort(1);
      redLED.setIsHubPortDevice(true);
      greenLED.setHubPort(4);
      greenLED.setIsHubPortDevice(true);

      //Data Event | Event code runs when data from sensor changes. 
      temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
          public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
              //Print temperature
              System.out.println("Temperature: " + e.getTemperature() + "°C");
          }
      });

      /*
      //Attach Event | Attach Events run when a Phidget is connected to the Object
      temperatureSensor.addAttachListener(new AttachListener() {
          public void onAttach(AttachEvent e) {
              System.out.println("Attach!");
          }
      });

      //Detach Event | Detach Events run when a Phidget is disconnected from the Object
      temperatureSensor.addDetachListener(new DetachListener() {
          public void onDetach(DetachEvent e) {
              System.out.println("Detach!");
          }
      });
      */
      
      //Event | Event code runs when data input from the sensor changes. The following event is a state change event. The code will listen to the button (Digital Input Object) and only run the contain code when the button is pressed or released (state changes).
      redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
          public void onStateChange(DigitalInputStateChangeEvent e) {
              //Record button state to turn on/off the red LED
              turnRedLEDOn = e.getState();  
          }
      });

      //Event | Event code runs when data input from the sensor changes. The following event is a state change event. It will listen to the button (Digital Input Object) and only run the contain code when the button is pressed or released (state changes).
      greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
          public void onStateChange(DigitalInputStateChangeEvent e) {
              //Record button state to turn on/off the green LED
        	  turnGreenLEDOn = e.getState();
          }
      });
      
      
      //Attach Event | Attach Events run when a Phidget is connected to the Object
      redButton.addAttachListener(new AttachListener() {
          public void onAttach(AttachEvent e) {
              //System.out.println("Attach!");
          }
      });
    //Detach Event | Detach Events run when a Phidget is disconnected from the Object
      temperatureSensor.addDetachListener(new DetachListener() {
          public void onDetach(DetachEvent e) {
              //System.out.println("Detach!");
          }
      });

      //Open
      //temperatureSensor.open(1000);
      redButton.open(1000);
      greenButton.open(1000);
      redLED.open(1000);
      greenLED.open(1000);

      //Keep program running
      while (true) {
    	  redLED.setState(turnRedLEDOn);
    	  System.out.println("Red button detached!");
    	  while (true)
    	  {
    		  
    		  if (redButton.getState() == true)
    		  {
    			  System.out.println("Attach!");
    			  Thread.sleep(1500);
    			  break;
    		  }
    		  else
    		  {
    			  System.out.println("Detach!");
    		  }
    		  Thread.sleep(250);
    	  }
    	  greenLED.setState(turnGreenLEDOn);
    	  System.out.println("Green button detached!");
    	  while (true)
    	  {
    		  if (greenButton.getState() == true)
    		  {
    			  System.out.println("Attach!");
    			  break;
    		  }
    		  else
    		  {
    			  System.out.println("Detach!");
    		  }
    		  Thread.sleep(250);
    	  }
          Thread.sleep(250);
          break;
      }
  }
}
