//Salvador Joshua Tarun III
//flip Java Program
//
//Compile program first
//Use javac flip.java in the command prompt
//Run the program
//Uses java flip
//git add .
//git commit -m "finished"
//git push -u

//Will bring in a Scanner for the user to input data
import java.util.Scanner;
import java.util.Random;
//Define a class
public class flip{
   
    // add main method
    public static void main(String[] args) {
        int runs = 0;
        while(runs < 100){
            //Creates Scanner and prompts question, not on a' new line for the input
            Scanner myScan = new Scanner( System.in );
            int tailscount = 0;
            int tails = 0;
            int heads = 0;
            System.out.print("Type 0 to flip once, or 1-99 to flip n times, or 100+ to end: ");
            //Creates first int
            runs = myScan.nextInt();
            if(runs >= 100){
                break;
            }
            if(runs == 0){
                tails = coin();
                runs = 1;
            }
            else{
                tails = coin(runs);
            }
            heads = runs - tails;
            System.out.println("There are " + tails + " instances of tails and " + heads + " instances of heads.");
           
        }
    }
    
    //add additional method
    public static int coin(int runs){
        int tails = 0;
        for (int i = 1; i <= runs; ++i){
            int tailscount = coin();
            if (tailscount == 1){
                tails++;
            }
        }
        return tails;
    }
    
    //add additional method
    public static int coin(){
        Random randomGenerator = new Random();
        int tailscount = 0;
        int rand = randomGenerator.nextInt(2);
        if (rand == 1){
            tailscount++;
           }
        return tailscount;
    }
}
