package Lessons;


//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class Lesson4 {
  public static void main(String[] args) throws Exception{

      //Create | Here you have created a TemperatureSensor object. TemperatureSensor is a class in your Phidgets library that gathers temperature data from your Phidget. 
      TemperatureSensor temperatureSensor = new TemperatureSensor();

      //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000  to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception will be thrown.
      temperatureSensor.open(1000);

      //Use your Phidgets | This code will print the temperature every 150ms
      while (true) {
          System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
          System.out.println("Fahrenheit: " + ((temperatureSensor.getTemperature() * 1.8) + 32) + " °C" );
          Thread.sleep(150);
          break;
      }
  }
}