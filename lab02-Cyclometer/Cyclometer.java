//Troy Egar
//Lab02 Cyclometer program
//February 5,2016
//Print the number of minutes for each trip
//Print the number of counts for each trip
//Print the distance in miles
//print the distance for the two trips combined
public class Cyclometer {
  //creates class
  public static void main(String[] args) {
   
 //Input data
        int secsTrip1=480;  //Variable for seconds during first trip
        int secsTrip2=3220;  //Variable for seconds during second trip
        int countsTrip1=1561;  //Variable for rotations during trip 1
        int countsTrip2=9037; //Variable for rotations during trip 2
 //Intermediate variables and output data
        double wheelDiameter=27.0,  //Declares Variable and following as doubles and stores 27 as wheelDiamter
        PI=3.14159, // Stores value of pi, under variable PI
        feetPerMile=5280,  //Distance(ft) in a mile, stored in feetPerMile
        inchesPerFoot=12,   //Stores 12in into variable inchesPerFoot
        secondsPerMinute=60;  //Stores 60 in variable secondsPerMinute
        double distanceTrip1, distanceTrip2,totalDistance;  //Declares Variables as doubles
 //Print statements
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
 //Final Calculations
        //run the calculations; store the values. 
        //Calculates distance of trip one in miles
        //Calculates distance of trip two in miles
        //Calculates total distance
         distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
         distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
         distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
          totalDistance=distanceTrip1+distanceTrip2;
  //Print out the output data.
           System.out.println("Trip 1 was "+distanceTrip1+" miles");
           System.out.println("Trip 2 was "+distanceTrip2+" miles");
           System.out.println("The total distance was "+totalDistance+" miles");
  } //end main method
}//end of class