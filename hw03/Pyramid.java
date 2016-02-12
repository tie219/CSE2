//Troy Egar
//hw03 conversion program
//February 12,2016
//Asks user for dimensions of a pyramid
//Outputs volume of pyramid
//
//Import scanner
import java.util.Scanner;
//
public class Pyramid {
  //creates class
  public static void main(String[] args) {
      //Declare and construct scanner
      Scanner myScanner = new Scanner( System.in );
      //
       System.out.print(" Enter the length of the square side of the pyramid "); //Prompts user to enter length
       double length = myScanner.nextDouble(); //Input declared as a double
       System.out.print(" Enter the height of the pyramid "); //Prompts user to enter length
       double height = myScanner.nextDouble(); //Height input declared as a double
       double Volume = (length * length * height)/3; //Volume of pyramid
       double NewVolume = Math.round(Volume*100)/100; //Rounding decimal place
       System.out.println("The volume inside the pyramid is:" +NewVolume+""); //Printing final volume
}
}
//end program
       
       