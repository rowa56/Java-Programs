import java.util.Scanner;
public class Calories{
     public static void main(String[] args){
        //declaring variables

        int servings,calories;

        // user inputs the number of cookies they have eaten

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of cookies u have ate: ");
        int cookies  = input.nextInt();

        //calculating the  total number of calories consumed

        
        servings = cookies/4;
        calories = servings * 300;

        System.out.println("Total calories: " + calories);
        
        input.close();
     }
    }