//Troy Egar
//March 27, 2016
//Rectangles - hw09
//Create two methods with same name that return void
//One accepts int, one accepts string
//Restrict user input to three games
import java.util.Scanner;
//Import packages
public class Rectangularize {
    //Method with int
    public static void Square(int box){
        //Length and width are equal to user input
        int length = box;
        int width = box;
        System.out.println("Output:");
        //Outer loop controls length 
        for(int i = 0; i<=length-1;i++){
            //Inner loop controls width
           for(int j = 0;j<=width-1;j++){
               System.out.print("%");
           }
           System.out.print("\n");
    }
          
    }
    //Method with string
    public static void Square(String boxtwo){
        //Length equal to characters of word
        int lengthString =  boxtwo.length();
        //Width equal to characters of word
        int widthString = lengthString;
        System.out.println("Output:");
        //Prints column of words equal to number of letters
        for(int i = 0; i<=lengthString-1;i++){
               System.out.println(boxtwo);
           }
    }
    
        

        
    
    public static void main(String[] args) {
        //Declare and construct scanner
          Scanner input = new Scanner(System.in);
          int boxInt = 0; //User input of integer
          String boxString = ""; //User input of string
          
          System.out.println("Please enter an input:");
          //If integer is entered
              if(input.hasNextInt()){
                  boxInt = input.nextInt();
                  Square(boxInt); //Calls method with integer
              }
              else if(input.hasNext()){
                  //If String if entered
                  boxString = input.next();
                  Square(boxString); //Calls method with string
              }
    }
    }
              
                
               
     
    