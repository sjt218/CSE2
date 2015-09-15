//Salvador Joshua Tarun III
//Timer Java Program
//
//Compile program first
//Use javac Timer.java in the command prompt
//Run the program
//Uses java Timer

//Will bring in a Scanner for the user to input data
import java.util.Scanner;
//Define a class
public class Timer{
   
    // add main method
    public static void main(String[] args) {
        //Creates Scanner and prompts question, not on a new line for the input
        Scanner myScan = new Scanner( System.in );
        System.out.print("Enter the current time: ");
        
        //Creates current time
        int currentTime = myScan.nextInt();
        
        //Prompts the user for dinner time
        System.out.print("Enter the time that you will be eating dinner: ");
        int dinnerTime = myScan.nextInt();
        
        //Finds remaining time
        int remainingTime = dinnerTime - currentTime;
        
        int hours, minutes; //for storing digits
        
        //get the whole amount, dropping minutes
        hours = remainingTime / 100;
        //Will get remainder by eliminating hours
        //Add 60 to account for the error of subtracting "00" by something
        minutes = (dinnerTime % 100 ) + 60 - (currentTime % 100 );
        //Mod 60 to eliminate the numbers above 60
        minutes = minutes % 60;
        //Absolute value to prevent negative values
        minutes = Math.abs(minutes);
        System.out.println("You have " + hours + " hours and " + minutes + " minutes until dinner.");
        
    }  
}