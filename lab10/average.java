//Salvador Joshua Tarun III
//average Java Program
//
//Compile program first
//Use javac average.java in the command prompt
//Run the program
//Uses java average
//git add .
//git commit -m "finished"
//git push -u

//Will bring in a Scanner for the user to input data
import java.util.Scanner;
import java.util.Random;
//Define a class
public class average{
   
    // add main method
    public static void main(String[] args) {
        boolean go = true;
        while(go == true){
            //Creates Scanner and prompts question, not on a' new line for the input
            Scanner myScan = new Scanner( System.in );
            int num, rand, sum = 0;
            double average;
            String check, n = "n", N = "N";
            Random randomGenerator = new Random();
            
            System.out.print("Provide a number n from 1-100: ");
            //Looks for Integer
            num = myScan.nextInt();
            if(num > 0 && num <= 100){
                int[] nums = new int[num];
                for (int i = 0; i < nums.length; i++){
                    rand = randomGenerator.nextInt(100);
                    nums[i] = rand;
                }
                for (int i = 0; i < nums.length; i++){
                    System.out.println(nums[i]);
                }
                for (int i = 0; i < nums.length; i++){
                    sum += nums[i];
                }
                average = (double) sum / (double) num;
                System.out.println("The sum is " + sum + " and the average is " + average + ".");
                System.out.println("The numbers greater or equal to the average are: ");
                for (int i = 0; i < nums.length; i++){
                    if (nums[i] >= average){
                        System.out.println(nums[i]);
                    }
                }
                System.out.println("Type n or N to stop.");
                check = myScan.next();
                if(check.equals(n) || check.equals(N)){
                    go = false;
                }
            }
        }
    }
}
