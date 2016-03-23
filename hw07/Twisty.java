//Troy Egar
//March 20, 2016
//Twisty - hw07
//Prompt the user for an integer length and width
//Width must be less than length and length less than 80
//Print result 
import java.util.Scanner;
//Import packages
public class Twisty {
  //creates class
  public static void main(String[] args) {
         //Construct Scanner
     Scanner input = new Scanner(System.in);
      //Initialize and declare input
      int length = 0;
      int width = 0;
      String error = "";
      //Error variable
      boolean condition = false;
      //Condition for while loop
      while (condition == false){
          System.out.println("Please enter a length:");
          //User inputs number
               while (!input.hasNextInt()){
                   //If input is not an integer
                error = input.next();
                //Error saved as string
               System.out.println("Invalid input, try again:");
       }
       length = input.nextInt();
       
       while (length>80){
           System.out.println("Invalid input, try again:"); 
           while (!input.hasNextInt()){
               //If input is still not an integer
                error = input.next();
               System.out.println("Invalid input, try again:");
               length = input.nextInt();
           }
       }
           
           System.out.println("Please enter a width:");
          //User inputs number
               while (!input.hasNextInt()){
                   //If input is not an integer
                error = input.next();
                //Error saved as string
               System.out.println("Invalid input, try again:");
       }
       width = input.nextInt();
       //Integer stored
           //Stores final correct value
           while (width>length){
           //Conditions on integer between 9 and 16
           System.out.println("Invalid input, try again:"); 
           while (!input.hasNextInt()){
               //If input is still not an integer
                error = input.next();
               System.out.println("Invalid input, try again:");
           }
           width = input.nextInt();
       }
       
        condition = true;
        //Loop breaks on change in boolean value
      }
      for(int i=1; i<width; i++){
       //Controls width of twist
          for(int k=1; k<length; k++){
           //Controls length of twist
          if(k%(2*width)==i){
           //Prints upward slope of hashtags based on modulus result
              System.out.print("#");
              
          }
          else if(k%(width)==i){
           //Prints downward slope of slashes based on modulus result
              System.out.print("\\");
          }
          else if(k%(2*width)==width+1-i){
           //Prints Upward slope of slashes based on modulus result
           System.out.print("/");
          }
          else if(k%(width)==width+1-i){
           //Prints Upward slope of hashtags based on modulus result
           System.out.print("#");
          }
          else{
           //Prints a space if boolean not satisfied
          System.out.print(" ");
          
      }
      }
     System.out.println("");
      }
  }
}