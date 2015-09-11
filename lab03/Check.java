//Salvador Joshua Tarun III
//Check Java Program
//
//Compile program first
//Use javac Check.java in the command prompt
//Run the program
//Uses java Check

//Will bring in a Scanner for the user to input data
import java.util.Scanner;
//Define a class
public class Check{
   
    // add main method
    public static void main(String[] args) {
        //Creates Scanner and prompts question, not on a new line for the input
        Scanner myScan = new Scanner( System.in );
        System.out.print("Enter the original cost of the check in the form xx.xx: ");
        
        //Creates check cost
        double checkCost = myScan.nextDouble();
        
        //Prompts the user for tip percentage, converts to decimal
        System.out.print("Enter the percentage tip that you want to pay as a whole number (in the form xx): ");
        double tipPercent = myScan.nextDouble();
        tipPercent /= 100;
        
        //Checks how many went to dinner
        System.out.print("Enter the number of people who went out to dinner: ");
        int numPeople = myScan.nextInt();
        
        double totalCost;
        double costPerPerson;
        int dollars, dimes, pennies; //for storing digits
        totalCost = checkCost * (1 + tipPercent);
        costPerPerson = totalCost / numPeople;
        //get the whole amount, dropping decimal fraction
        dollars=(int)costPerPerson;
        //mod 10 will divide number by ten and report remainder, which is why dimes and pennies must be calculated separately
        dimes=(int)(costPerPerson * 10) % 10;
        pennies=(int)(costPerPerson * 100) % 10;
        System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies);
        
    }  
}