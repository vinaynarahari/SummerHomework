import java.util.*;
/**
 * Write a description of class average here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class twopointtwo
{
    public static void main (String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the first number?");
        int question1 = scanner.nextInt();
        
        System.out.println("What is the second number?");
        int question2 = scanner.nextInt();
        
        System.out.println("What is the third number?");
        int question3 = scanner.nextInt();
        
        System.out.println((question1 + question2 + question3)/3);
        

        
    }

}
