//Salvador Joshua Tarun III
//Cyclometer Java Program
//
//Compile program first
//Use javac Cyclometer.java in the command prompt
//Run the program
//Uses java Cyclometer

//Define a class
public class Cyclometer{
    //Add main method, required for every Java program
    public static void main(String[] args) {
        int secsTrip1 = 480; //The seconds that the first trip took
        int secsTrip2 = 3320; //The seconds that the second trip took
        int countsTrip1 = 1561; //The number of rotations in trip one
        int countsTrip2 = 9037; //The number of rotations in trip two
        
        //Important variables
        
        double wheelDiameter = 27.0; //Diameter of wheel, used to find circumference
        double pi = 3.14159; //Also used in circumference
        int feetPerMile = 5280; //Used to convert for distance
        int inchesPerFoot = 12; //Used to convert for distance
        int secondsPerMinute = 60; // Used to convert for time
        double distanceTrip1; //Stored data
        double distanceTrip2; //Stored data
        double totalDistance; //Stored data
        
        System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute) + " minutes and had " + countsTrip1 + " counts.");
        
        System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute) + " minutes and had " + countsTrip2 + " counts.");
        
        distanceTrip1 = countsTrip1 * wheelDiameter * pi;
        //Gives distance in inches
        distanceTrip1 = distanceTrip1 / (inchesPerFoot * feetPerMile);
        //Gives distance in miles
        distanceTrip2 = countsTrip2 * wheelDiameter * pi / (inchesPerFoot * feetPerMile);
        //Gives distance in miles
        totalDistance = distanceTrip1 + distanceTrip2;
        //Gives total distance
        
        //Print out the output data
        System.out.println("Trip 1 was " + distanceTrip1 + " miles.");
        System.out.println("Trip 2 was " + distanceTrip2 + " miles.");
        System.out.println("The total distance was  " + totalDistance + " miles.");
        

        

        
    }  //End main
}//End class