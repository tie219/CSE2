//Troy Egar
//February 21,2016
//Hexidecimal Conversion, hw04
//Take three RGB colors from user
//Covert Values to hexidecimal
import java.util.*;
//Import Scanner

public class ToHex {
  //creates class
  public static void main(String[] args) {
      //Construct a Scanner
      Scanner input = new Scanner(System.in);
      
      //Declare & Initialize User input values
      int R = 0;
      int G = 0;
      int B = 0;

      //Enter three integer values 
      System.out.print("Please enter three numbers representing RGB values:");
      try{ 
      R = input.nextInt();
      //Assigns first value as R
      }
      //Determine whether input is an integer
      catch (InputMismatchException e){
          System.out.println("Sorry, you must input an integer value");
          System.exit(0);//Exits program if inout is invalid
      }
      //Checks if R is greater than 255
      if (R>255){ 
        System.out.println("Sorry, value must be between 0-255.");
        System.exit(0); //Exits program if inout is invalid
      }
      //Checks if R is less than 0
      else if (R<0){
         System.out.println("Sorry, value must be between 0-255.");
         System.exit(0);//Exits program if inout is invalid
      }
      try{
       G = input.nextInt();
      }
       //Determine whether input is an integer
       catch (InputMismatchException e){
           System.out.println("Sorry, you must input an integer value");
           System.exit(0);//Exits program if inout is invalid
       }
       //Checks if G is greater than 255
      if (G>255){
        System.out.println("Sorry, value must be between 0-255.");
        System.exit(0);//Exits program if inout is invalid
      }
     //Checks if G is less than 0
      else if (G<0){
         System.out.println("Sorry, value must be between 0-255.");
         System.exit(0);//Exits program if inout is invalid
      }
      try{
      B = input.nextInt();
      }
       //Determine whether input is an integer
      catch (InputMismatchException e){
           System.out.println("Sorry, you must input an integer value");
           System.exit(0);//Exits program if inout is invalid
       }
       //Checks if B is greater than 255
       if (B>255){
        System.out.println("Sorry, value must be between 0-255.");
        System.exit(0);//Exits program if inout is invalid
        //Constraints above 255 on B
       }
       //Checks if B is less than 0
       else if (B<0){
         System.out.println("Sorry, value must be between 0-255.");
         System.exit(0);//Exits program if inout is invalid
      }
  
      //Declare and initialize main String for Hexadecimal
      String mainHexidecimal = "";
      //
      
      //Division of R by 16 to convert
      
      int ValueR = R/16;
      //Number of times 16 goes into R
      String ValueR2 = ""+ValueR;
       //Convert to String for Switch
      int ValueG = G/16;
      //Number of times 16 goes into G
      String ValueG2 = ""+ValueG;
      //Convert to String for Switch
      int ValueB = B/16;
      //Number of times 16 goes into B
      String ValueB2 = ""+ValueB;
       //Convert to String for Switch
      
      
      //Initial Value of Hexadecimal
      mainHexidecimal = ValueR2+ValueG2+ValueB2;
      
      //Switch for remainders that are above 9
      switch (ValueR){
        case 10: 
           ValueR2 = "A";
          break;
        case 11: 
           ValueR2 = "B";
          break;
        case 12:
           ValueR2 = "C";
          break;
        case 13:
           ValueR2 = "D";
          break;
        case 14:
           ValueR2 = "E";
          break;
        case 15:
           ValueR2 = "F";
          break;
      }
      //Updated Value of Hexadecimal
  mainHexidecimal = ValueR2+ValueG2+ValueB2; 
  
  //Switch for remainders above 9 for G
      switch (ValueG){
        case 10:
           ValueG2 = "A";
          break;
        case 11: 
           ValueG2 = "B";
          break;
        case 12: 
           ValueG2 = "C";
          break;
        case 13:
           ValueG2 = "D";
          break;
        case 14:
           ValueG2 = "E";
          break;
        case 15: 
           ValueG2 = "F";
          break;
      }
     //Updated String
      mainHexidecimal = ValueR2+ValueG2+ValueB2;
      
      //Switch for remainders above 9 for B
      switch (ValueB){
        case 10: 
           ValueB2 = "A";
          break;
        case 11: 
           ValueB2 = "B";
          break;
        case 12: 
           ValueB2 = "C";
          break;
        case 13:
           ValueB2 = "D";
          break;
        case 14:
           ValueB2 = "E";
          break;
        case 15: 
           ValueB2 = "F";
          break;
      }
     //Updated String
      mainHexidecimal = ValueR2+ValueG2+ValueB2;

      //Modulus operator to obtain remainder
      
     int RemainderR = R % 16;
     String HexiR=""+RemainderR;
     //R value divided by 16 and remainder stored
     //String created declared and initialized for switch
     int RemainderG = G % 16;
      String HexiG = ""+ RemainderG;
     //G value divided by 16 and remainder stored
     //String created declared and initialized for switch
     int RemainderB = B % 16;
      String HexiB = ""+ RemainderB;
     //B value divided by 16 and remainder stored
     //String created declared and initialized for switch
     
     //Updated String with remainder included
     mainHexidecimal = ValueR2+HexiR+ValueG2+HexiG+ValueB2+HexiB;

      //If remainder is greater than 9
      switch (RemainderR){
         case 10: 
             HexiR = "A";
             break;
        case 11: 
             HexiR = "B";
             break;
        case 12: 
             HexiR = "C";
             break;
        case 13: 
             HexiR = "D";
             break;
        case 14: 
             HexiR = "E";
             break;
        case 15: 
             HexiR = "F";
             break;
      }
      //Updated String
      mainHexidecimal = ValueR2+HexiR+ValueG2+HexiG+ValueB2+HexiB;
      
        //If remainder is greater than 9
        switch (RemainderG){
         case 10: 
             HexiG = "A";
             break;
        case 11: 
             HexiG = "B";
             break;
        case 12: 
             HexiG = "C";
             break;
        case 13: 
             HexiG = "D";
             break;
        case 14: 
             HexiG = "E";
             break;
        case 15: 
             HexiG = "F";
             break;
        }
        
        //Updated String
        mainHexidecimal = ValueR2+HexiR+ValueG2+HexiG+ValueB2+HexiB;
             
      //If remainder is greater than 9
        switch (RemainderB){
         case 10: 
             HexiB = "A";
             break;
        case 11: 
             HexiB = "B";
             break;
        case 12: 
             HexiB = "C";
             break;
        case 13: 
             HexiB = "D";
             break;
        case 14: 
             HexiB = "E";
             break;
        case 15: 
             HexiB = "F";
             break;
      }
      
      //Final Updated String 
      mainHexidecimal = ValueR2+HexiR+ValueG2+HexiG+ValueB2+HexiB;
      
      //Prints RGB values and their new Hexadecimal Value as one string
      System.out.print("The decimal numbers R:"+R);
      System.out.print(",G:"+G);
      System.out.print(",R:"+R);
      System.out.print(", is represented in hexadecimal as: "+mainHexidecimal);
      System.out.println("");
      
        }
      }
     