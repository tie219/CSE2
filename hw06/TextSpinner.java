//Troy Egar
//March 6, 2016
//Text Spinner - hw06
//Prompt the user for an integer between 9 and 16
//Calculate factorial
//Print result 
//Must use while loop
import java.util.Scanner;
//Import packages
public class TextSpinner {
  //creates class
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
      //Construct Scanner
      boolean condition = true;
      //condition for loop
      String a = "/";
      //First Spinner position
      String b = "-";
      //Second Spinner position
      String c = "\\";
      //Third Spinner position
      String d = "|";
      //Fourth Spinner position
      while (condition == true){
          System.out.print(a);
          //Prints First Character
          System.out.print("\b");
          //Deletes First Character
          System.out.print(b);
          //Prints Second Character
          System.out.print("\b");
          //Deletes Second Character
          System.out.print(c);
          //Prints Third Character
          System.out.print("\b");
          //Deletes Third Character
          System.out.print(d);
          //Prints Fourth Character
          System.out.print("\b");
          //Deletes Fourth Character
      }
  }
}