//Troy Egar
//April 15, 2016
//Array Search lab
//Ask user to input 15 integers with constraints on input
//Print out array and use user input to search for grade
//Then repeat except with array scrambled
import java.util.Scanner;
import java.util.Random;
//Import packages
public class CSE2Linear {
  //creates class
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int[] grades = new int[15]; 
      String error = "";
      //Initialize and declare variables
     for(int i =0; i<15;i++){
      //Outer loop controls number of times a user enters input
         if(i==0){
         System.out.println("Please enter 15 integers");
         }
         //Input must be integer
          while (!input.hasNextInt()){
                   //If input is not an integer
                error = input.next();
                //Error saved as string
               System.out.println("Invalid input, try again:");
       }
       grades[i] = input.nextInt();
       //Bounds on array value from 0-100
           while (grades[i]>100 || grades[i]<0){
           //Conditions on integer between 9 and 16
           System.out.println("Invalid input, try again:"); 
           while (!input.hasNextInt()){
               //If input is still not an integer
                error = input.next();
               System.out.println("Invalid input, try again:");
           }
           grades[i] = input.nextInt();
       }
       //Next value in array mus be greater than previous
          if(i>0){
           while(grades[i]<=grades[i-1]){
                System.out.println("Invalid input, try again:"); 
           while (!input.hasNextInt()){
               //If input is still not an integer
                error = input.next();
               System.out.println("Invalid input, try again:");
           }
            while (grades[i]>100 || grades[i]<0){
           //Conditions on integer between 9 and 16
           System.out.println("Invalid input, try again:"); 
            }
           grades[i] = input.nextInt();
           }
     }
  }
  System.out.println("Sorted:");
  //Loop that prints out array
  for(int i = 0; i<grades.length;i++){
      System.out.print(grades[i]+" ");
  }
  System.out.println("\n");
  System.out.println("Enter a grade to search for:");
        int searchGrade = input.nextInt();
        //Performs linear search in array and counts interations
  for(int i = 0; i<grades.length;i++){
      if(grades[i] == searchGrade){
         i = i+1;
          System.out.println(searchGrade+" "+"was found in the list with "+i+" iterations");
          break;
      }
      //If the value is not found
      else if(i == 13){
       int w = i+2;
       System.out.println("Sorry "+searchGrade+" was not found with "+(w)+" iterations");
      }
  }
  int randomNum = 0;
  int value = 0;
  //Shuffling random array
  for(int i = 0; i<grades.length;i++){
    randomNum = (int) (Math.random()*grades.length);
    value = grades[randomNum];
    grades[randomNum] = grades[i];
    grades[i] = value;
  }
  //Displays randomized array to user
  System.out.println("Scrambled:");
  for(int i = 0; i<grades.length;i++){
      System.out.print(grades[i]+" ");
  }
 System.out.println("\n");
 System.out.println("Enter a grade to search for:");
 //Another linear search prompted by the user
       searchGrade = input.nextInt();
  for(int i = 0; i<grades.length;i++){
      if(grades[i] == searchGrade){
         i = i+1;
          System.out.println(searchGrade+" "+"was found in the list with "+i+" iterations");
          break;
      }
       else if(i == 13){
       int w = i+2;
       System.out.println("Sorry "+searchGrade+" was not found with "+(w)+" iterations");
      }
      }
  }
}