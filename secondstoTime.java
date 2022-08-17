import java.util.*;


public class secondstoTime
{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What time (in secounds) would you like to convert?");
        int time = scanner.nextInt();
        
        int remainTime = time / 60;
        int hours = remainTime / 60;
        int minutes = remainTime - (60* hours);
        
        
        int seconds = time % 60;
        
        System.out.println("Hours:" + hours +"\n Minutes:" + minutes + "\n Seconds:" + seconds);
        
    }
}
