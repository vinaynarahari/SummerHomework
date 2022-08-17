import java.util.*;
/**
 * Write a description of class fahrenheitCelsius here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class twoPointFour
{
    public static void main (String[] args){
        
        final int BASE = 32;
        final double CONVERSION_FACTOR = 5.0 / 9.0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is the temperature in Fahrenheit?)");
        double fahrenheitTemp = scanner.nextDouble();
        
        double celsiusTemp;

        celsiusTemp = (fahrenheitTemp - BASE) * CONVERSION_FACTOR;
        System.out.println ("Celsius Temperature: " + celsiusTemp);
    }
    
}
