//Salvador Joshua Tarun III
//encrypted_x Java Program
//
//Compile program first
//Use javac encrypted_x.java in the command prompt
//Run the program
//Uses java encrypted_x
//git add .
//git commit -m "finished"
//git push -u

//Will bring in a Scanner for the user to input data
import java.util.Scanner;
//Define a class
public class encrypted_x{
   
    // add main method
    public static void main(String[] args) {
        //Creates Scanner and prompts question, not on a' new line for the input
        Scanner myScan = new Scanner( System.in );
        System.out.print("Enter an integer from 0 - 100: ");
        //Creates first int
        int size = myScan.nextInt();
        
        if(size < 0 || size > 100){
            System.exit(-1);
        }
        
        for (int i=0; i<=size; i++) {
            System.out.println();
            for (int j=0; j<size + 1; j++) {
                    if(j == i || j == (size-i)){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
            }

        }
        System.out.println();
    }  
}