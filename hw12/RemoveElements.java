//Troy Egar
//April 17, 2016
//Copy code from hw
//Write in methods to produce expected output
import java.util.Scanner;
import java.util.Random;
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	randomInput(num);
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println("\n");
  	System.out.println(out);
  	int newArray3[] = num;
  	
   	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	while(index>9||index<0){
  	  System.out.println("Sorry your index is out of bounds, try again:");
  	  index = scan.nextInt();
  	}
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
    System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
  
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
  public static void randomInput(int[] newArray3){
    //Method for creating random array
      for(int i =0; i<newArray3.length;i++){
        //Assigns random values to array from 0-9
          newArray3[i] = (int) (Math.random()*9);
      }
  }
  public static int[] remove(int[] num2, int target2){
    int bound = 0;
    boolean condition = false;
    int j = 0;
    //Initialize variable
    for(int i = 0;i<10;i++){
      //Counts how many of the target is in array, sets bound
      if(target2 == num2[i])
      bound = bound + 1; 
    }
    int[] newArray5 = new int[10-bound];
    for(int i = 0; i<10-bound;i++){
      //Outer loop controls newly formed array
      while(j<10 && condition == false){
        //Inner loop controls the former loop
        if(num2[j]!=target2){
          //Assigns value that is not a target
        newArray5[i] = num2[j];
        condition = true;
        }
        j++;
      }
      condition = false;
    }
      return newArray5;
      }
    
      
      
  public static int[] delete(int[] num3, int index2){
      int[] newArray4 = new int[9];
      for(int i = 0; i<9;i++){
        if(i<index2){
          //Assigns values of original array to new array
        newArray4[i] = num3[i];
        }
        else if(i>=index2){
          //Shifts array once index is reached
          newArray4[i] = num3[i+1];
      }
      }
        return newArray4;
  }
}

