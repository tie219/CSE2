//Troy Egar
//Lab03 Check program
//February 12,2016
//Use scanner to calculate results
//Find original cost of check
//Percentage tip they wish to pay
//Number of ways the check will be split

//Import Scanner
import java.util.Scanner;
//
public class Check {
  //creates class
  public static void main(String[] args) {
      //Declare Scanner and construct
      Scanner myScanner = new Scanner( System.in );
      //User inputs cost of check
      System.out.print("Enter the original cost of the check in the form xx.xx: ");
      //Cost of check assigned to variable
      double checkCost = myScanner.nextDouble();
      //User inputs percent tip they want to pay
      System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): " );
      //Tip perentage assigned to variable
      double tipPercent = myScanner.nextDouble();
      //We want to convert the percentage into a decimal value
      tipPercent /= 100; 
      //User inputs number of guests at dinner
      System.out.print("Enter the number of people who went out to dinner: ");
      //Number of people assigned to variable
      int numPeople = myScanner.nextInt();
      //Print out the output
      double totalCost; //declare variable totalCost
      double costPerPerson;//declare variable costPerPerson
      int dollars,   //whole dollar amount of cost 
      dimes, pennies; //for storing digits
      //to the right of the decimal point 
      //for the cost$ 
      totalCost = checkCost * (1 + tipPercent);//Storing value into totalCost
      costPerPerson = totalCost / numPeople;//Storing value into costPerPerson
      //get the whole amount, dropping decimal fraction
      dollars=(int)costPerPerson;//Gets dollars amount
      dimes=(int)(costPerPerson * 10) % 10;//Gets dimes amount
      pennies=(int)(costPerPerson * 100) % 10;//Gets pennies amount
      //Example:
      // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
      //  where the % (mod) operator returns the remainder
      //  after the division:   583%100 -> 83, 27%5 -> 2 
      //
      //Final amount that each person owes is printed
      System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);
  }
}
//End program