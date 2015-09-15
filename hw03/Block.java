//Salvador Joshua Tarun III
//Block Java Program
//
//Compile program first
//Use javac Block.java in the command prompt
//Run the program
//Uses java Block

//Will bring in a Scanner for the user to input data
import java.util.Scanner;
//Define a class
public class Block{
   
    // add main method
    public static void main(String[] args) {
        //Creates Scanner and prompts question, not on a new line for the input
        Scanner myScan = new Scanner( System.in );
        System.out.print("Enter the length of the block: ");
        
        //Creates length
        double length = myScan.nextDouble();
        
        System.out.print("Enter the width of the block: ");
        
        //Creates width
        double width = myScan.nextDouble();
        
        System.out.print("Enter the height of the block: ");
        
        //Creates height
        double height = myScan.nextDouble();
        
        double volume = length * width * height;
        double sideA = length * width;
        double sideB = length * height;
        double sideC = width * height;
        double surfaceArea = (sideA + sideB + sideC) * 2;
        
        System.out.println("The volume of the block of dimensions " + length + " x " + width + " x " + height + " is " + volume + ". The surface area of the block is " + surfaceArea + ".");
        
    }  
}