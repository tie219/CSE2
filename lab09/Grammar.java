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
        int randomAdj = randomGenerator.nextInt(10);
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
        }
        return adjective;
    }
        public static String subjectNoun(){
        int randomSub = randomGenerator.nextInt(10);
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
        }
        return sub;
    }
    public static String pastVerb(){
        int randomVerb = randomGenerator.nextInt(10);
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
        }
        return verb;
    }
    public static String objNoun(){
        int randomObj = randomGenerator.nextInt(10);
        switch (randomObj){
            case 0: String obj = "played";
            break;
            case 1: String obj = "walked";
            break;
            case 2: String obj= "threw";
            break;
            case 3: String obj = "laughed";
            break;
            case 4: String obj = "ate";
            break;
            case 5: String obj = "cried";
            break;
            case 6: String obj = "barked";
            break;
            case 7: String obj = "chewed";
            break;
            case 8: String obj = "crushed";
            break;
            case 9: String obj = "ran";
            break;
        }
        return obj;
    }
    
  //creates class
  public static void main(String[] args) {
      
      Random randomGenerator = new Random();
      String adjective = "";
      String sub = "";
      String verb = "";
      String obj = "";
      String x = "";
      
      for(int i = 0; i<=6; i++){
          x = objNoun();
          System.out.print(x);
          
      }
  }
  }
      
      
     