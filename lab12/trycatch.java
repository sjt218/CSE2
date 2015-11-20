//Salvador Joshua Tarun III
//trycatch Java Program
//
//Compile program first
//Use javac trycatch.java in the command prompt
//Run the program
//Uses java trycatch

//git add .
//git commit -m "finished"
//git push -u

//Will bring in a Scanner for the user to input data
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

//Define a class
public class trycatch{
   
    // add main method
    public static void main(String[] args) {
        try{
            //Creates Scanner and prompts question, not on a new line for the input
            Scanner myScan = new Scanner( System.in );
            Random randomGenerator = new Random();
            System.out.print("Enter the array size: ");
            //Looks for Integer
            int num = myScan.nextInt();
            int rand;
            int[] field = new int[num-1];
            field = new int[num];
            for(int i = 0; i < field.length; i++){
                rand = randomGenerator.nextInt(101);
                field[i] = rand;
            }
            System.out.println(Arrays.toString(field));
            System.out.print("Enter location to move number to end: ");
            //Looks for Integer
            int pos = myScan.nextInt();
            int place = field[pos];
            for (int i = pos; i < field.length - 1; i++){
                field[i] = field[i+1];
            }
            field[field.length-1] = place;
            System.out.println(Arrays.toString(field));
        }
        catch(Exception e){
            System.out.println("Cannot build an array of size < 0");
        }
    }
}