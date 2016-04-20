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
      String error = "";
      int width = 3;
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
       condition = true;
      }
      
      for (int i = 1;i<length + 1;i++){
           if(i%3 == 1){
             System.out.print("\\");
           }
           else if(i%3==0){
             System.out.print("/");
           }
           else{
             System.out.print(" ");
           }
      }
      System.out.print("\n");
      System.out.print(" ");
      for (int j = 1;j<length;j++){
           if(j%3 == 1){
             System.out.print("x");
           }
           else{
             System.out.print(" ");
           }
      }
      System.out.print("\n");
       for (int i = 1;i<length + 1;i++){
           if(i%3 == 0){
             System.out.print("\\");
           }
           else if(i%3==1){
             System.out.print("/");
           }
           else{
             System.out.print(" ");
           }
      }
      System.out.println("\n");
  }
}
       
       
       