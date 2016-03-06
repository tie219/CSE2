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
      int num = 10;
      String error = "";
      boolean condition = false;
      while (condition == false){
          System.out.println("Please enter a positive integer:");
          error = input.next();
           while (error>9 && error <16 ){
            num = input.nextInt();
              break;
           }
       while (error>16 || error<9 || !input.hasNextInt()){
               System.out.println("Invalid input, try again:");
               error = input.next();
           }
               num = input.nextInt();

        condition = true;
      }
      System.out.println(num);
  }
  }
      