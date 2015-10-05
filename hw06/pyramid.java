//Salvador Joshua Tarun III
//pyramid Java Program
//
//Compile program first
//Use javac pyramid.java in the command prompt
//Run the program
//Uses java pyramid
//git add .
//git commit -m "finished"
//git push -u

//Will bring in a Scanner for the user to input data
import java.util.Scanner;
//Define a class
public class pyramid{
   
    // add main method
    public static void main(String[] args) {
        //Creates Scanner and prompts question, not on a new line for the input
        Scanner myScan = new Scanner( System.in );
        System.out.print("What size pyramid? ");
    
        //Creates first int
        int size = myScan.nextInt();
        System.out.println();
        for (int i=1; i<=size; i++) {
            for (int j=0; j<size - i; j++) {
                    System.out.print(" ");
            }
            for (int k=1; k<=(i*2 - 1); k++){
                    System.out.print("*");
            }
            System.out.println();
        }
    }  
}