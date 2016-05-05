//Troy Egar
//April 23, 2016
//Holoportation HW12
//Write a method called soRandom
//Randomize results
import java.util.Scanner;
import java.util.Random;
//Import packages
public class Holoporter {
  //creates class
  public static void main(String[] args) {
      String[][][] mainArray = soRandom();
      //Object Array
      String[][][] shellArray = soRandom();
      //ShellArray
      for(int i = 0;i<mainArray.length;i++){
          for(int j = 0;j<mainArray[i].length;j++){
              for(int k = 0;k<mainArray[i][j].length;k++){
          mainArray[i][j][k] = coder();
          //Assigns random values to object array
      }
      }
      }
      print(mainArray);
      shellArray = holoport(mainArray,shellArray);
      sampling(mainArray);
      percentage(mainArray,shellArray);
      String[][][] frankArray = frankenstein(mainArray);
     print(frankArray);
  }
  public static String[][][] soRandom(){
      //Creates an array of random lengths
      int randomSize =0;
      randomSize = (int) ((Math.random()*10)+1);
      int randomSize2 = (int) ((Math.random()*10)+1);
      String[][][] soRandomArray = new String[randomSize][][];
      for(int i =0; i<soRandomArray.length;i++){
          randomSize = (int) ((Math.random()*10)+1);
          soRandomArray[i] = new String[randomSize][];
      }
      for(int i =0; i<soRandomArray.length;i++){
          for(int j = 0; j<soRandomArray[i].length;j++){
          randomSize = (int) ((Math.random()*10)+1);
          soRandomArray[i][j] = new String[randomSize];
      }
      }
      
      return soRandomArray;
}
public static String coder(){
    //Creates unique codes of numbers 0-9 an letter A-Z
    String code = "";
    int randomNumCode = (int) (Math.random()*9);
    int randomLetterCode = (int)(Math.random()*26);
    for(int i = 0;i<6;i++){
        if(i<2){
            randomLetterCode = (int)(Math.random()*25);
            switch(randomLetterCode){
                case 0: code = code + "A";
                break;
                case 1: code = code + "B";
                break;
                case 2: code = code + "C";
                break;
                case 3: code = code + "D";
                break;
                case 4: code = code + "E";
                break;
                case 5: code = code + "F";
                break;
                case 6: code = code + "G";
                break;
                case 7: code = code + "H";
                break;
                case 8: code = code + "I";
                break;
                case 9: code = code + "J";
                break;
                case 10: code = code + "K";
                break;
                case 11: code = code + "L";
                break;
                case 12: code = code + "M";
                break;
                case 13: code = code + "N";
                break;
                case 14: code = code + "O";
                break;
                case 15: code = code + "P";
                break;
                case 16: code = code + "Q";
                break;
                case 17: code = code + "R";
                break;
                case 18: code = code + "S";
                break;
                case 19: code = code + "T";
                break;
                case 20: code = code + "U";
                break;
                case 21: code = code + "V";
                break;
                case 22: code = code + "W";
                break;
                case 23: code = code + "X";
                break;
                case 24: code = code + "Y";
                break;
                case 25: code = code + "Z";
                break;
                default: code = "";
                 break;
            }
        }
            else{
                randomNumCode = (int) (Math.random()*9);
                code = code + randomNumCode;
            }
        }
        return code;
}
 public static void print(String[][][] printArray){
     //Formats the Array 
      System.out.println("Your Array:");
      System.out.print("[");
      for(int i = 0;i<printArray.length;i++){
        if(i<printArray.length-1 && i>0){
                System.out.print("]");
                System.out.print("---");
                System.out.print("[");
      }
          for(int j = 0;j<printArray[i].length;j++){
              for(int k = 0;k<printArray[i][j].length;k++){
                  if(k == printArray[i][j].length-1){
                      System.out.print("" + printArray[i][j][k]);
                      break;
                  }
          System.out.print(printArray[i][j][k] + ",");
              }
              if(j<printArray[i].length-1){
              System.out.print("]");
              System.out.print("|");
              System.out.print("[");
              }

      }
    }
    System.out.print("]");
    System.out.println("");
 }
 public static String[][][] holoport(String[][][] main, String[][][] container){
    int i = 0;
    int j = 0;
    int k = 0;
         //Holoprts array by truncating container or adding $$$$ if container is longer
        if(main.length>=container.length){
            //Checks first dimension
            for(i = 0;i<container.length;i++){
               if(main[i].length>=container[i].length){
                   //Checks second dimenstion
                 for(j = 0;j<container[i].length;j++){
                     if(main[i][j].length>=container[i][j].length){
                         //Checks third dimension
                        for(k = 0;k<container[i][j].length;k++){
                            container[i][j][k]= main[i][j][k];
                        }  
                    }
         else{
                for(k = 0;k<main[i][j].length;k++){
             container[i][j][k]= main[i][j][k];
         } 
           for(k = main[i][j].length;k<container[i][j].length;k++){
                container[i][j][k] = "$$$$$$";
                //Adds if container is longer
                }
              
                
            }
        }
    }
    else{
         for(j = 0;j<main[i].length;j++){
             container[i][j] = main[i][j];
                }
                for(j = main[i].length;j<container[i].length;j++){
                    //Truncates container if container is longer
             container[i][j]= new String[0];
         }  
                
            }
          }
        }
      else{
         for(i = 0;i<main.length;i++){
             container[i] = main[i];
                }
                for(i = main.length;i<container.length;i++){
             container[i]= new String[0][0];
         }  
                
            }
     return container;
}
public static void sampling(String [][][] mainArray){
    //Searces for code, using charAt, I check each character inputed 
    //by the user to ensure its in the form of XXYYYY
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a valid code to search for:");
    String code = input.next();
    char val1 = code.charAt(0);
    while(val1<65 || val1>90){
      System.out.println("Invalid input try again:");  
      code = input.next();
      val1 = code.charAt(0);
    }
    char val2 = code.charAt(1);
    while(val2<65 || val2>90){
      System.out.println("Invalid input try again:");  
      while(val1<65 || val1>90){
      System.out.println("Invalid input try again:");  
      code = input.next();
      val1 = code.charAt(0);
      }
      code = input.next();
      val2 = code.charAt(1);
    }
    char val3 = code.charAt(2);
     while(val3<48 || val3>57){
         System.out.println("Invalid input try again:");
           while(val2<65 || val2>90){
              System.out.println("Invalid input try again:");  
              code = input.next();
              val2 = code.charAt(0);
                }
                 while(val1<65 || val1>90){
                    System.out.println("Invalid input try again:");  
                        code = input.next();
                            val1 = code.charAt(0);
      }
    code = input.next();
    val3 = code.charAt(2);
     }
     char val4 = code.charAt(3);
     while(val4<48 || val4>57){
     System.out.println("Invalid input try again:");   
     while(val3<48 || val3>57){
         System.out.println("Invalid input try again:");
         code = input.next();
         val3 = code.charAt(2);
          }
           while(val2<65 || val2>90){
              System.out.println("Invalid input try again:");  
              code = input.next();
              val2 = code.charAt(0);
                }
                 while(val1<65 || val1>90){
               System.out.println("Invalid input try again:");  
               code = input.next();
                val1 = code.charAt(0);
      }
      code = input.next();
      val4 = code.charAt(3);
}
char val5 = code.charAt(4);
    while(val5<48 || val5>57){
     System.out.println("Invalid input try again:");   
     while(val4<48 || val4>57){
     System.out.println("Invalid input try again:"); 
     code = input.next();
      val4 = code.charAt(3);
     while(val3<48 || val3>57){
         System.out.println("Invalid input try again:");
         code = input.next();
         val3 = code.charAt(2);
          }
           while(val2<65 || val2>90){
              System.out.println("Invalid input try again:");  
              code = input.next();
              val2 = code.charAt(0);
                }
                 while(val1<65 || val1>90){
               System.out.println("Invalid input try again:");  
               code = input.next();
                val1 = code.charAt(0);
      }
      code = input.next();
      val5 = code.charAt(4);
}
}
 int var = 0;
 //Looks for code and gives coordinate
 for(int i = 0;i<mainArray.length;i++){
          for(int j = 0;j<mainArray[i].length;j++){
              for(int k = 0;k<mainArray[i][j].length;k++){
          if(mainArray[i][j][k].equals(code)){
              var = 1;
              System.out.println("Found "+code+" at: " +"("+i+","+j+","+k+").");
              break;
          }
          
      }
      }
      }
     if(var == 0){
         System.out.println("Code not found");
     }

}
public static void percentage(String[][][] mainArray,String[][][] shellArray){
    int counter = 0;
    int counter2 = 0;
     //Counts elements in object array
    for(int i = 0; i<mainArray.length;i++){
        for(int j = 0;j<mainArray[i].length;j++){
            for(int k = 0;k<mainArray[i][j].length;k++){
            counter++;
            }
        }
    }
    //Counts elements in container array
    for(int i = 0; i<shellArray.length;i++){
        for(int j = 0;j<shellArray[i].length;j++){
            for(int k = 0;k<shellArray[i][j].length;k++){
            counter2++;
            }
        }
    }
    //Gives percentage
   double num = ((double)(counter2 - counter)/counter);
   double percent = num * 100;
   System.out.println("The percentage is:");
   System.out.println(((int)(percent*100)/100.00)+"%");
   
            
}
public static String[][][] frankenstein(String[][][] mainArray){
    //Sorts array based on alphabetical and numerical order
    int pointer = 0;
    for(int i = 0;i<mainArray.length;i++){
      for(int j = 0; j<mainArray[i].length;j++){
          for(int k = 1; k<mainArray[i][j].length;k++){
                  pointer = k;
                  //Method compareTo sorts alphabetically and then numberically if letters are the same
                  while(mainArray[i][j][pointer].compareTo(mainArray[i][j][pointer-1])<0){
                    String temp = mainArray[i][j][pointer-1];
                     mainArray[i][j][pointer-1] = mainArray[i][j][pointer];
                    mainArray[i][j][pointer] = temp;
                    pointer--;
                if(pointer==0){
                  pointer = 0;
                  break;
                  
              }
              }
              }
              
      }
      }//Sorts the array by length
      for(int i = 0;i<mainArray.length;i++){
      for(int j = 1; j<mainArray[i].length;j++){
                  pointer = j;
                  while(mainArray[i][pointer].length<mainArray[i][pointer-1].length){
                    String[] temp = mainArray[i][pointer-1];
                     mainArray[i][pointer-1] = mainArray[i][pointer];
                    mainArray[i][pointer] = temp;
                    pointer--;
                if(pointer==0){
                  break;
              }
              }
              }
              
      }
return mainArray;
}
}





