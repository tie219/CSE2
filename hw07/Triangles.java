//Troy Egar
//March 20, 2016
//Triangles - hw07
//Prompt the user for an integer between 5 and 30
//Print result 
//Must use for, while, and do while loops
import java.util.Scanner;
//Import packages
public class Triangles {
  //creates class
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
      //Construct Scanner
      int num = 0;
      int i = 0;
      int k;
      //Initialize and declare input
      String error = "";
      //Error variable
      boolean condition = false;
      //Condition for while loop
      while (condition == false){
          System.out.println("Please enter a positive integer:");
          //User inputs number
               while (!input.hasNextInt()){
                   //If input is not an integer
                error = input.next();
                //Error saved as string
               System.out.println("Invalid input, try again:");
       }
       num = input.nextInt();
       while (num<5 || num>30){
        System.out.println("Invalid input, try again:");
        while (!input.hasNextInt()){
                   //If input is not an integer
                error = input.next();
                //Error saved as string
               System.out.println("Invalid input, try again:");
        }
             num = input.nextInt();
       }
       condition = true;
      }
      
      //Number triangle using for loop
      System.out.println("For loop:");
     for(i=0;i<=num;i++){
         //Sets amount of lines printed
           for(k=0;k<i;k++){
               //Sets amount of numbers printed in each line
               System.out.print(i);
               //Prints number accordingly
           }
           System.out.print("\n");
       } 
      for(i=num-1;i>=1;i--){
          //Prints bottom part of triangle/number of lines to be printed
           for(k=0;k<i;k++){
               //amount of numbers on each line
               System.out.print(i);
           }
           System.out.print("\n");
       }
       
       //Number triangle using while loop
       System.out.print("\n");
       System.out.println("While loop:");
 
       while (i<=num){
           k = 0;
           //Amount of lines to be printed in top part of triangle
           while(k<i){
               //Sets amount of numbers printed in each line
               System.out.print(i);
               k++;//counter
           }
           System.out.print("\n");
           i++;//counter
           }
           //
           i = num-1;
        while (i>=1){
            ////Sets amount of numbers printed in each line in bottom
            k=0;
            while(k<i){
                 //Sets amount of numbers printed in each line
                System.out.print(i);
                k++;
            }
            System.out.print("\n");
            i--;//Decrements counter
            }
        
        
        //Number triangle for Do-while loop
        System.out.print("\n");
        System.out.println("Do-while loop");


        //Top part of triangle
        i = 0;
        do{
            k = 0;
            System.out.print("\n");
            i++;
            //Prints space and increments i

            do{
                System.out.print(i);
                k++;
                //Prints i and increments k
            }
            while(k<i);
            //while k is less than i
        }
                while(i<num);
                //While i is less than user input
        //Bottom part of triangle
        i = num-1;
        do{
            k=0;
            System.out.print("\n");
            //prints space and assigns 0 to k
            do{
                System.out.print(i);
                k++;
                //prints value for i and increments k
            }
            while(k<i);
            //While k is less than i
            i--;
            //Decrement i counter
        }
        while(i>=1);
        //Only while i is greater than or equal to 1
        
        System.out.println("\n");
    
  }
}
     
          
 

      
       