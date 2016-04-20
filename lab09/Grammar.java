//Troy Egar
//March 23, 2016
//lab09
//Generate random number 0-9
//Craete cases to produce string for user
//Print result 
import java.util.Random;
//Import packages
public class Grammar {
    public static String adjectives(){
        Random randomGenerator = new Random();
        int randomAdj = randomGenerator.nextInt(10);
        String adjective = "";
        switch (randomAdj){
            case 0: adjective = "brave";
            break;
            case 1: adjective = "adorable";
            break;
            case 2: adjective = "beautiful";
            break;
            case 3: adjective = "black";
            break;
            case 4: adjective = "funny";
            break;
            case 5: adjective = "hungry";
            break;
            case 6: adjective = "grumpy";
            break;
            case 7: adjective = "hilarious";
            break;
            case 8: adjective = "nervous";
            break;
            case 9: adjective = "upset";
            break;
            default: adjective = "";
            break;
        }
        return adjective;
    }
        public static String subjectNoun(){
         Random randomGenerator = new Random();
        int randomSub = randomGenerator.nextInt(10);
        String sub = "";
        switch (randomSub){
            case 0: sub = "banana";
            break;
            case 1: sub = "cannon";
            break;
            case 2: sub = "baseball";
            break;
            case 3: sub = "camera";
            break;
            case 4: sub = "balloon";
            break;
            case 5: sub = "dog";
            break;
            case 6: sub = "woman";
            break;
            case 7: sub = "rainstorm";
            break;
            case 8: sub = "oatmeal";
            break;
            case 9: sub = "cat";
            break;
            default: sub = "";
            break;
        }
        return sub;
    }
    public static String pastVerb(){
        Random randomGenerator = new Random();
        int randomVerb = randomGenerator.nextInt(10);
        String verb = "";
        switch (randomVerb){
            case 0: verb = "played";
            break;
            case 1: verb = "walked";
            break;
            case 2: verb = "threw";
            break;
            case 3: verb = "laughed";
            break;
            case 4: verb = "ate";
            break;
            case 5: verb = "cried";
            break;
            case 6: verb = "barked";
            break;
            case 7: verb = "chewed";
            break;
            case 8: verb = "crushed";
            break;
            case 9: verb = "ran";
            break;
            default: verb = "";
            break;
        }
        return verb;
    }
    public static String objNoun(){
        Random randomGenerator = new Random();
        int randomObj = randomGenerator.nextInt(10);
        String obj = "";
        switch (randomObj){
            case 0: obj = "car";
            break;
            case 1: obj = "platypus";
            break;
            case 2: obj= "owl";
            break;
            case 3: obj = "toy";
            break;
            case 4: obj = "cow";
            break;
            case 5: obj = "bus";
            break;
            case 6: obj = "game";
            break;
            case 7: obj = "ball";
            break;
            case 8: obj = "picture";
            break;
            case 9: obj = "spoon";
            break;
            default: obj = "bowl";
            break;
        }
        return obj;
    }
    
  //creates class
  public static void main(String[] args) {
      
      Random randomGenerator = new Random();
      String adjMain = "";
      String subMain = "";
      String verbMain = "";
      String objMain = "";
      String wordMain = "The";
      
      for(int i = 0; i<=5; i++){
          if(i == 0 || i == 1){
              wordMain = wordMain +" "+adjectives();
          }
          else if(i== 2){
              wordMain = wordMain +" "+ subjectNoun();
          }
          else if( i== 3){
              wordMain = wordMain +" "+ pastVerb();
          } 
          else if(i == 4){
                  wordMain = wordMain +" "+ "the"  +" "+ adjectives();
        
              }
          else if(i == 5){
            wordMain = wordMain +" "+ objNoun();
          }
              
          }
          System.out.println(wordMain+".");
          }
          
      }
      
      
     