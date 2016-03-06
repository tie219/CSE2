//Troy Egar
//March 4, 2016
//Fibonacci Sequence - hw06
//Prompt the user for 3 integers
//Must be positive and integers
//Print the users fibonacci sequence
import java.util.Scanner;
//Import packages
public class Fibonacci {
  //creates class
  public static void main(String[] args) {
     
      Scanner input = new Scanner(System.in);
      //Construct Scanner
      int a1 = 0;
      int a2 = 0;
      int n = 0;
      int nextNum = 0;
      int i = 0;
      String wrong  = "";
      boolean condition = false;
      //Initialize and declare values for user input
      while (condition == false){
          System.out.println("Please enter a positive integer:");
           while (!input.hasNextInt()){
               wrong = input.next();
               System.out.println("Invalid input, try again:");
           }
           a1 = input.nextInt();
           while (a1<0){
               System.out.println("Invalid input, try again:");
               a1 = input.nextInt();
           }
           
           System.out.println("Please enter a second positive integer:");
           while (!input.hasNextInt()){
               wrong = input.next();
               System.out.println("Invalid input, try again:");
           }
           a2 = input.nextInt();
           while (a2<0){
               System.out.println("Invalid input, try again:");
               a2 = input.nextInt();
           }
           
           System.out.println("How many custom Fibonnaci numbers should be printed?");
           while (!input.hasNextInt()){
               wrong = input.next();
               System.out.println("Invalid input, try again:");
           }
           n = input.nextInt();
           while (n<0){
               System.out.println("Invalid input, try again:");
               n = input.nextInt();
           }
           condition = true;
      }
 System.out.println("The numbers are:");
      while (i<n-3){
          while (i<1){
               System.out.print(a1 + "," + a2 + ",");
               break;
          }
        nextNum = a1+a2;
        System.out.print(nextNum + ",");
        
        a1 = a2;
        a2 = nextNum;
         i++;
      }
      System.out.print(nextNum + a1 + ".");
      System.out.println("\n");
      
      
           

           
           
      }
}
      