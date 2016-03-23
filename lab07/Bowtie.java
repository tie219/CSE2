//Troy Egar
//March 11, 2016
//Bowtie lab
//Create a bowtie using nested while loops
//Prompt the user for an input using scanner
//Convert to do-while loop
import java.util.Scanner;
//Import packages
public class Bowtie {
  //creates class
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
     int nStars = 9;
     int i = 1;

     
     while (nStars>=0){
         System.out.print("*");
         nStars--;
         while (nStars>=1)
         System.out.println("*");
         nStars--;
     }
  }
}