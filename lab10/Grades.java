//Troy Egar
//April 8, 2016
//Array lab
//Input student names and grades into array
//Randomize results
import java.util.Scanner;
//Import packages
public class Grades {
  //creates class
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int randomStudent = (int) (Math.random()*6)+5;
     System.out.println(randomStudent);
     String[] students = new String[randomStudent];
     for(int i = 0; i<randomStudent;i++){
         System.out.println("Please enter the names of"+" "+randomStudent+" "+"students");
         students[i] = input.next();
     }
     int[] midterm = new int[randomStudent];
     int randomGrade = 0;
     for(int j = 0; j<randomStudent;j++){
         randomGrade = (int) (Math.random()*100);
         midterm[j] = randomGrade;
     }
     System.out.println("Here are the midterm grades of the 5 students above:");
     for(int k = 0; k<randomStudent; k++){
         System.out.println(students[k]+":"+midterm[k]);
     }
  }
}
     