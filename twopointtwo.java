import java.util.*;
/*
Name: Vinay Narahari
Date: 8/16/22
Program Title: 2.2
Program Description: Reads 3 numbers and gives average
Variable List: question1, question2 , question 3


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
        
        System.out.println("Average:" + " " + ((question1 + question2 + question3)/3));
        

        
    }

}
