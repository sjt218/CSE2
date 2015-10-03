//Salvador Joshua Tarun III
//averageGrade Java Program
//
//Compile program first
//Use javac averageGrade.java in the command prompt
//Run the program
//Uses java averageGrade
//git add .
//git commit -m "finished"
//git push -u

//Will bring in a Scanner for the user to input data
import java.util.Scanner;
//Define a class
public class averageGrade{
   
    // add main method
    public static void main(String[] args) {
        boolean go = true, valid = true, first = true;
        double average = 0;
        //Creates Scanner and prompts question, not on a new line for the input
        Scanner myScan = new Scanner( System.in );
        while (go == true){
            System.out.print("Enter grade to average, from 0 to 100, type 999 to stop: ");

            //Creates first double
            double int1 = myScan.nextDouble();
            // if int1 == 999, terminate
            if(int1 == 999){
                go = false;
            }
            //if int1 is not 999 but above 100 or below 0, say invalid
            if(int1 < 0 || int1 > 100 && go == true){
                System.out.println("Invalid grade has been entered.");
                valid = false;
            }
            else{
                valid = true;
            }
            if(go == true && valid == true && first == true){
                average += int1;
            }
            if(go == true && valid == true && first == false){
                average = (int1 + average)/2;
            }
            first = false;
        }
        System.out.println("Average is " + average + ". ");
    }  
}