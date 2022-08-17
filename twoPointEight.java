import java.util.*;
import java.lang.Math;

/*
Name: Vinay Narahari
Date: 8/16/22
Program Title: 2.8
Program Description: finds distance between two (x,y) coordinates
Variable List: scanner, x1, x2, y1, y2, totalX, totalY, distance


*/
public class twoPointEight
{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a pair of x and y coordinates (format:(x y)");
        
        double x1 = scanner.nextInt();
        double y1 = scanner.nextInt();
        
        
        System.out.println("Give a pair of x and y coordinates (format:(x y)");
        
        double x2 = scanner.nextInt();
        double y2 = scanner.nextInt();
        
        
        double totalX = Math.pow((x2 -x1),2); 
        double totalY = Math.pow((y2 - y1),2);
        double distance = Math.sqrt(totalX - totalY);
    
        System.out.println("The distance between the two coordinates is:" + distance);
    }
}
