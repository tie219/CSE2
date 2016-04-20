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
     
     int nStars = 13;
     int i = 0;
     int j = 13;
     int spaces = 0;
     int spaces2 = 3;
     //While loop

      while(i<9){
          if(i<5){
          while (spaces<i){
         System.out.print(" ");
         spaces = spaces + 1;
     }
         while (j>4){
         System.out.print("*");
         j--;
     }
     nStars = nStars - 2;
     j= nStars;
     System.out.print("\n");
     i++;
     spaces = 0;
  }
     if(i>4&&i<10){
         while (spaces<spaces2){
         System.out.print(" ");
         spaces = spaces + 1;
         }
          while (j>0){
         System.out.print("*");
         j--;
     }
     nStars = nStars + 2;
     j= nStars;
     System.out.print("\n");
     i++;
     spaces2 = spaces2 -1;
     spaces = 0;
     }
}
//User input
boolean condition = false;
String error = "";
while(condition==false){
         System.out.println("Please enter an odd integer between 3 andd 33 inclusive:");
          while (!input.hasNextInt()){
                   //If input is not an integer
                error = input.next();
                //Error saved as string
               System.out.println("Invalid input, try again:");
       }
       nStars = input.nextInt();
       while(nStars<3||nStars>33){
             System.out.println("Invalid input, try again:");
             while (!input.hasNextInt()){
               //If input is still not an integer
                error = input.next();
               System.out.println("Invalid input, try again:");
           }
             nStars = input.nextInt();
       }
       while(nStars%2!=1){
        System.out.println("Invalid input, try again:");
        while (!input.hasNextInt()){
               //If input is still not an integer
                error = input.next();
               System.out.println("Invalid input, try again:");
           }
           nStars = input.nextInt();
       }
    condition = true;
}
int bound = nStars;
int lim = ((nStars/2)+1);
nStars = nStars+4;
j = nStars;
spaces = 0;
//For loop

for (i = 0;i<bound;i++){
     if(i<lim){
          if (spaces<i){
         System.out.print(" ");
         spaces = spaces + 1;
     }
         if (j>4){
         System.out.print("*");
         j--;
     }
     nStars = nStars - 2;
     j= nStars;
     System.out.print("\n");
     spaces = 0;
  }
  /*
     if(i>(lim-1) && i<(lim+1)){
         if(spaces<spaces2){
         System.out.print(" ");
         spaces = spaces + 1;
         }
          if (j>0){
         System.out.print("*");
         j--;
     }
     nStars = nStars + 2;
     j= nStars;
     System.out.print("\n");
     i++;
     spaces2 = spaces2 -1;
     spaces = 0;
     }
     */
}

 
}
}