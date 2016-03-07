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
      //Declare and initialize input value
      int a2 = 0;
      //Declare and initialize input value
      int n = 0;
      //Declare and initialize input value for number of digits
      int nextNum = 0;
      //Next number in seuqnce
      int i = 0;
      //Counter
      String wrong  = "";
      //String for invalid input
      boolean condition = false;
      //Condition for loop
      //Initialize and declare values for user input
      while (condition == false){
          System.out.println("Please enter a positive integer:");
          //First input
           while (!input.hasNextInt()){
               //Not a valid integer
               wrong = input.next();
               //Stores string
               System.out.println("Invalid input, try again:");
           }
           a1 = input.nextInt();
           //Stores correct input
           while (a1<0){
               //Values less than zero
               System.out.println("Invalid input, try again:");
               a1 = input.nextInt();
               //Stores value
           }
           
           System.out.println("Please enter a second positive integer:");
           //Input of a second integer
           while (!input.hasNextInt()){
               //Not a valid integer
               wrong = input.next();
               //Stores incorrect
               System.out.println("Invalid input, try again:");
           }
           a2 = input.nextInt();
           //Stores correct input
           while (a2<0){
               //Integer values less than zero
               System.out.println("Invalid input, try again:");
               a2 = input.nextInt();
               
           }
           
           System.out.println("How many custom Fibonnaci numbers should be printed?");
           while (!input.hasNextInt()){
               //Incorrect input
               wrong = input.next();
               //Stores incorrect
               System.out.println("Invalid input, try again:");
           }
           n = input.nextInt();
           //Number of digits
           while (n<0){
               //Cant be less than 0
               System.out.println("Invalid input, try again:");
               n = input.nextInt();
           }
           condition = true;
           //Breaks loop when conditions are fulfilled
      }
 System.out.println("The numbers are:");
      while (i<n-3){
          //Times to run through loop with counter
          while (i<1){
              //User's input numbers
               System.out.print(a1 + "," + a2 + ",");
               break;
          }
        nextNum = a1+a2;
        //Next number in sequence
        System.out.print(nextNum + ",");
        //Prints next number with comma
        a1 = a2;
        //Stores second number into first
        a2 = nextNum;
        //Stores second number into the next
         i++;
         //Increments counter
      }
      System.out.print(nextNum + a1 + ".");
      //Last number in sequence to end with period
      System.out.println("\n");
      
      
           

           
           
      }
}
      