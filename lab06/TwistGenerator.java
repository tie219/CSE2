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
      
      int integer = 0;
      boolean condition = false;

      while(condition == false) {
          System.out.println("Please enter a length as an integer");
          integer = input.nextInt();
          System.out.println("test");
        if (integer == input.nextInt()){
          condition = true;
      }
          else {
      System.out.println("That was not an integer");
      }
  }
  System.out.println("test");
}
}
      