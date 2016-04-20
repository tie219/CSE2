//Troy Egar
//April 15, 2016
//Array Search lab
//Create two arrays and randomize values
//Search for max and mins
import java.util.Scanner;
//Import packages
public class Search {
  //creates class
  public static void main(String[] args) {
      int randomNum = 0;
      int minNum = 0;
      int maxNum = 0;
      int[] array1 = new int[50];
      int[] array2 = new int[50];
      //Array 1
      for(int i =0;i<50;i++){
          randomNum = (int) (Math.random()*100);
          array1[i] = randomNum;
      }
      for(int k = 0;k<50;k++){
          if(k==0){
              maxNum = array1[k];
          }
          else if(array1[k]>maxNum){
              maxNum = array1[k];
          }
      }
      System.out.println("The max number is:"+" "+maxNum);
      for(int k = 0;k<50;k++){
          if(k==0){
              minNum = array1[k];
          }
          else if(array1[k]<minNum){
              minNum = array1[k];
          }
      }
      System.out.println("The minimum number is:"+" "+minNum);
      //Array 2
      for(int j =0;j<50;j++){
          if(j==0){
              array2[j] = (int) (Math.random()*100);
          }
          else if(j>0){
           array2[j] = ((int) (Math.random()*100)) + array2[j-1];
      }
      }
      
       for(int x = 0;x<50;x++){
          if(x==0){
              minNum = array2[x];
          }
          else if(array1[x]<minNum){
              minNum = array2[x];
          }
      }
      System.out.println("The maximum number is:"+" "+minNum);
      System.out.println("The minimum number is:"+" "+array2[0]);
      
  }
}