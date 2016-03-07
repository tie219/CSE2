//Troy Egar
//March 4, 2016
//Factorial calculator - hw06
//Prompt the user for an integer between 9 and 16
//Calculate factorial
//Print result 
//Must use while loop
import java.util.Scanner;
//Import packages
public class RunFactorial {
  //creates class
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
      //Construct Scanner
      int num = 0;
      //Initialize and declare input
      String error = "";
      //Error variable
      boolean condition = false;
      //Condition for while loop
      while (condition == false){
          System.out.println("Please enter a positive integer:");
          //User inputs number
               while (!input.hasNextInt()){
                   //If input is not an integer
                error = input.next();
                //Error saved as string
               System.out.println("Invalid input, try again:");
       }
       num = input.nextInt();
       //Integer stored
       while (num<9 || num>16){
           //Conditions on integer between 9 and 16
           System.out.println("Invalid input, try again:"); 
           while (!input.hasNextInt()){
               //If input is still not an integer
                error = input.next();
               System.out.println("Invalid input, try again:");
           }
           num = input.nextInt();
           //Stores final correct value
       }
        condition = true;
        //Loop breaks on change in boolean value
      }
      
      int i = 1;
      //Counter
      int fact = 1;
      //Starting factorial value
      while (i<num){
        fact = fact * i;
        //Factorial increases with counter until input reached
        i++;
      }
      System.out.println("Input accepted:");
      System.out.println(num+"!"+"="+fact);
      //Value printed
  }
  }