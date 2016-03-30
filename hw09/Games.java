//Troy Egar
//March 27, 2016
//Games - hw09
//Prompt the user for the game they would like to play
//Create 3 methods for three different games
//Restrict user input to three games
import java.util.Scanner;
//Import packages
public class Games {
    //Guess the Box Game method
    public static String guessTheBox(){
        //String for incorrect input
        String error = "";
        //Initiallize and declare box
        int box =0;
        //String for return statement
        String finish = "";
        //Construct and declare scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number 1-3:");
        //Prevents non-integer input
        while (!input.hasNextInt()){
                   //If input is not an integer
                error = input.next();
                //Error saved as string
               System.out.println("Invalid input, try again:");
       }
       box = input.nextInt();
       //Prevents input outside 3 and 1
       while (box>3 || box<1){
           System.out.println("Invalid input, try again:"); 
           while (!input.hasNextInt()){
               //If input is still not an integer
                error = input.next();
               System.out.println("Invalid input, try again:");
           }
               box = input.nextInt();
           }
           //Chooses a random number between 1 and 3
           int randomBox = (int) (Math.random()*3)+1;
           //If user input and random number match, user wins
           if(randomBox == box){
               System.out.println("Congratulations, you win a cookie");
           }
           else{
               System.out.println("Sorry, you chose the wrong box");
           }
             return finish;
    }
    public static String spinTheWheel(){
        //Declare and construct scanner
        Scanner input = new Scanner(System.in);
        //Initalize and declare variables to be used{
        String color = ""; //Initial user input
        String error = "";
        int error2 = 0;
        int numWheel = 0; //Initial user input
        String finish = "";
        int redWheel = 0; //If the input matches correct option
        int blackWheel = 0;//If the input matches correct option
        int randomColor = 0;//randomly generated color
        int randomNum = 0;//randomly generated number
        String result = "";
        //}
        System.out.println("Input an integer from 1-5:");
        //Prompts user for input between one and 5
        while (!input.hasNextInt()){
                   //If input is not an integer
                error = input.next();
                //Error saved as string
               System.out.println("Invalid input, try again:");
       }
       numWheel = input.nextInt();
       //Constrains input to between 1 and 5
        while (numWheel>5 || numWheel<1){
           System.out.println("Invalid input, try again:"); 
           while (!input.hasNextInt()){
               //If input is still not an integer
                error = input.next();
               System.out.println("Invalid input, try again:");
           }
               numWheel = input.nextInt();
           }
           //Asks user for color
        System.out.println("Input a color: red or black");
            while (!input.hasNext()){
                 //If input is not an integer
                error = input.next();
                //Error saved as string
               System.out.println("Invalid input, try again:");
       }
          color = input.next();
          //Sets values depending on user input
          if(color.equals("red")){
               redWheel = 1;
               blackWheel = 2;
          }
          else if(color.equals("black")){
               blackWheel = 2;
               redWheel = 1;
          }
          //Allows for "any capitalization"
          else if(color.equals("Red")){
               redWheel = 1;
               blackWheel = 2;

          }
          //Allows for "any capitalization"
          else if(color.equals("Black")){
               blackWheel = 2;
               redWheel = 1;
          }
          else{
              error2 = 1;
              //Input not satisfied
          }
          //If user input is neither acceptable value
          //While loop to get user to reenter a correct value
          while(error2 == 1){
              System.out.println("Invalid input, try again:");
               color = input.next();
          if(color.equals("red")){
               redWheel = 1;
               blackWheel = 2;
               error2 = 0;
          }
          else if(color.equals("black")){
               blackWheel = 2;
               redWheel = 1;
               error2 = 0;
          }
          //Allows for "any capitalization"
          else if(color.equals("Red")){
               redWheel = 1;
               blackWheel = 2;
               error2 = 0;

          }
          //Allows for "any capitalization"
          else if(color.equals("Black")){
               blackWheel = 2;
               redWheel = 1;
               error2 = 0;
          }
          else{
              error2 = 1;
          }
          }
 
          //Chooses random color and number
         randomColor = (int)(Math.random()*2)+1;
         randomNum = (int)(Math.random()*5)+1;
         if(randomColor == 1){
             result = "red";
         }
         else if(randomColor == 2){
             result = "black";
         }
         //If the color and number inputed by user match randomly generated results
         if(randomColor == redWheel && randomNum == numWheel ){
             System.out.println("The wheel spun a:" + result +" "+ randomNum);
             System.out.println("Congratulations, your choice matches!!");
         }
          else if(randomColor == blackWheel && randomNum == numWheel){
             System.out.println("The wheel spun a:" + result +" "+ randomNum);
             System.out.println("Congratulations, your choice matches!!");
         }
         else {
              System.out.println("The wheel spun a:" + result +" "+ randomNum);
              System.out.println("Sorry, you lose");
         }
        
         return finish;
        
        
}
       
        public static String scrambler(){
           String finish = "";
           Scanner input = new Scanner(System.in);
           //Declare and construct a scanner
           System.out.println("Please enter a word:");
           String a = input.next();
           //Saves user input as string
           String wordOne = ""; //First half of word
           String wordTwo = ""; //Second half of word
           String wordFinal = ""; //Final word
           int lengthWord =  a.length(); //takes length of word
           int randomLetter = 0; //Initialize and declare
           randomLetter = (int) (Math.random()*lengthWord); //Chooses a random position
           wordOne = a.substring(0,randomLetter); //Cuts of word from 0 to random position
           wordTwo = a.substring(randomLetter,lengthWord); //Collects second half of word
           wordFinal = wordTwo + wordOne; //Puts final word together
           //loop to randomize even more
           for(int i = 0;i<=10;i++){
           randomLetter = (int) (Math.random()*lengthWord);//Chooses another random position
           wordOne = wordFinal.substring(0,randomLetter);
           //Same process as above but looped
           wordTwo = wordFinal.substring(randomLetter,lengthWord);
           wordFinal = wordTwo + wordOne;
           }
           //Prints final word
           System.out.println(wordFinal);
           
           return finish;
        }
             
           
    
  //creates class
  public static void main(String[] args) {
      

     Scanner input = new Scanner(System.in);
     //Declare and construct scanner
     String game = "";//User input
     System.out.println("Welcome to Egar game center");
     System.out.println("Please choose one of three games:guessTheBox, spinTheWheel, and scrambler:");
     game = input.next();
     //If user chooses guessTheBox
     if (game.equals("guessTheBox")){
         //Call that method
         game = guessTheBox();
     }
     //If user chooses spinTheWheel
     else if(game.equals("spinTheWheel")){
         //Call that method
         game = spinTheWheel();
     }
     //If user chooses scrambler
     else if(game.equals("scrambler")){
         //Call that method
         game = scrambler();
     }
     else {
         //If input doesn't match
         System.out.println("Sorry, we don't have that game here!");
         System.exit(0);
     }
     
  }
}
     
     