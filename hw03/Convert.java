//Troy Egar
//hw03 conversion program
//February 12,2016
//Asks user to input distance in meters
//Program outputs distance in inches
//
//Import scanner
import java.util.Scanner;
//
public class Convert {
  //creates class
  public static void main(String[] args) {
      //Declare and construct scanner
      Scanner myScanner = new Scanner( System.in );
      //
      System.out.print(" Enter the distance in meters in the form of xx:xx "); //Prompts user to input distance in meters
      double meters = myScanner.nextDouble(); //Input declared as a double
      double inches = meters * 39.37; //Converting meters to inches
      double inchesDec = Math.round(inches*10000)/10000.0; //rounding to four decimal places
      System.out.println(+ meters + " meters is " +inchesDec+ " inches"); //Printing final conversion in inches
  }
}
//end program
      
      
      
