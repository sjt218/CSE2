//Salvador Joshua Tarun III
//Calculator Java Program
//
//Compile program first
//Use javac Calculator.java in the command prompt
//Run the program
//Uses java Calculator

//Will bring in a Scanner for the user to input data
import java.util.Scanner;
//Define a class
public class Calculator{
   
    // add main method
    public static void main(String[] args) {
        //Creates Scanner and prompts question, not on a new line for the input
        Scanner myScan = new Scanner( System.in );
        System.out.print("Enter first number: ");
        
        //Creates first double
        double int1 = myScan.nextDouble();
        
        //Prompts the user for second double
        System.out.print("Enter second number: ");
        double int2 = myScan.nextDouble();
        
        //scans for a string that needs to be a symbol
        System.out.print("Enter the operator, + is 1, - is 2, * is 3, / is 4: ");
        int operator = myScan.nextInt();
        //Where result will be stored
        double result;
        
        switch (operator) {
            case 1: result = int1 + int2;
                    break;
            case 2: result = int1 - int2;
                    break;
            case 3: result = int1 * int2;
                    break;
            case 4: result = int1 / int2;
                    break;
            default: System.out.println("Invalid operator.");
                     result = 0;
                    break;
        }
      System.out.println("The answer is " + result + ". "); 
        
        
    }  
}