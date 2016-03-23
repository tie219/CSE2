//Troy Egar
//March 4, 2016
//Twist Generator - Lab 6
//Prompt the user for an integer
//Implement input into while loop that will print twist
import java.util.Scanner;//
//Import packages
public class TwistGenerator {
  //creates class
  public static void main(String[] args) {
      //Construct a Scanner
      Scanner input = new Scanner(System.in);
      
      int length = 0;
      boolean condition = false;
      String wrong = "";
      String Twist = 

      while(condition == false) {
          System.out.println("Please enter a positive integer:");
          //First input
           while (!input.hasNextInt()){
               //Not a valid integer
               wrong = input.next();
               //Stores string
               System.out.println("Invalid input, try again:");
           }
        length = input.nextInt();
          condition = true;
      }
      int length1 = length/3;
      int length2 = length%3;
      int i = 0;
      while (i<length){
      while (length2 == 0){
      