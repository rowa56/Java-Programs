import java.util.Scanner;
public class SecondsConversion{
     public static void main(String[] args){

      //declaring variables
        int minutes,hours,weeks,days;

        // user inputs the number of seconds they want to convert
        Scanner input = new Scanner(System.in);
        System.out.println("Enter seconds: ");
        int seconds = input.nextInt();

        //calculating the  total number of minutes, hours, days and weeks


        minutes = seconds/60;
        hours = seconds/3600;
        days = seconds/86400;
        weeks = seconds/604800;

        System.out.println("Minutes: "+ minutes);
         System.out.println("Hours: "+ hours);
         System.out.println("Days: "+ days);
          System.out.println("Weeks: "+ weeks);
         input.close();  
    }

     }