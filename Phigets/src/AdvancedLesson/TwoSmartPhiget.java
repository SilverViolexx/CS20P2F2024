package AdvancedLesson;

//Add Phidgets Library 
import com.phidget22.*;

public class TwoSmartPhiget {
	static boolean redState= false;
	static boolean greenState= false;
  public static void main(String[] args) throws Exception{

      //Create 
      TemperatureSensor temperatureSensor0 = new TemperatureSensor();
      TemperatureSensor temperatureSensor1 = new TemperatureSensor();
      DigitalInput redButton = new DigitalInput();
      DigitalInput greenButton = new DigitalInput();

      //Address | Smart Phidgets must be addressed when you are using more than one of the same software objects in your program. Setting the HubPort allows you to keep track of which physical Phidget is paired with each software object. If you do not address the objects, your program will have unpredictable results.
      temperatureSensor0.setHubPort(3);
      temperatureSensor1.setHubPort(2);
      redButton.setHubPort(0);
      redButton.setIsHubPortDevice(true);
      greenButton.setHubPort(5);
      greenButton.setIsHubPortDevice(true);
       
    //Event | Event code runs when data input from the sensor changes. The following event is a state change event. The code will listen to the button (Digital Input Object) and only run the contain code when the button is pressed or released (state changes).
      redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
          public void onStateChange(DigitalInputStateChangeEvent e) {
              redState = e.getState();
              
          }
      });

      //Open 
      temperatureSensor0.open(1000);
      temperatureSensor1.open(1000);
      redButton.open(1000);
      greenButton.open(1000);
      

      //Use your Phidgets 
      while (true) {
          if (redButton.getState())
          {
        	  System.out.println("Temperature 0: " + temperatureSensor0.getTemperature() + " °C" );
        	  Thread.sleep(150);
          }
          else if (greenButton.getState())
          {
        	  System.out.println("Temperature 1: " + temperatureSensor1.getTemperature() + " °C" );
        	  Thread.sleep(150);
          }
          
          
      }
  }
}