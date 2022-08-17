import java.util.*;
import java.lang.Math;

/*
Name: Vinay Narahari
Date: 8/16/22
Program Title: 2.3
Program Description: Gives quotient, remainder, power, sum , difference, product
Variable List: quotient, remainder, power, sum difference, product , scanner , a , b


*/
public class twoPointThree
{
   public static void main(String[] args){
       
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Give the first number");
       float a = scanner.nextFloat();

       System.out.println("Give the seconds number");
       float b = scanner.nextFloat();
       
       float quotient = a / b;
       float remainder =  a % b;
       double power = Math.pow(a,b);
       float sum = a + b;
       float difference = a - b;
       float product = a * b;
       
       
       System.out.println("Quotient:" + quotient + "/Remainder:" + remainder + "/nPower:" + power + "/nSum:" + sum + "/nDifference:" + difference + "/nProduct:" + product);
       
       
       
       
       
       
   }
}
