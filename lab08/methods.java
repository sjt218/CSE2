//Salvador Joshua Tarun III
//methods Java Program
//
//Compile program first
//Use javac methods.java in the command prompt
//Run the program
//Uses java methods
//git add .
//git commit -m "finished"
//git push -u

//Will bring in a Scanner for the user to input data
import java.util.Scanner;
//Define a class
public class methods{
   
    // add main method
    public static void main(String[] args) {
        //Creates Scanner and prompts question, not on a' new line for the input
        Scanner myScan = new Scanner( System.in );
        System.out.print("Input ten numbers, enter the first: ");
        //Creates first int
        int fir = myScan.nextInt();
        System.out.print("Input ten numbers, enter the second: ");
        int sec = myScan.nextInt();
        System.out.print("Input ten numbers, enter the third: ");
        int thi = myScan.nextInt();
        System.out.print("Input ten numbers, enter the fourth: ");
        int fou = myScan.nextInt();
        System.out.print("Input ten numbers, enter the fifth: ");
        int fif = myScan.nextInt();
        System.out.print("Input ten numbers, enter the sixth: ");
        int six = myScan.nextInt();
        System.out.print("Input ten numbers, enter the seventh: ");
        int sev = myScan.nextInt();
        System.out.print("Input ten numbers, enter the eighth: ");
        int eig = myScan.nextInt();
        System.out.print("Input ten numbers, enter the ninth: ");
        int nin = myScan.nextInt();
        System.out.print("Input ten numbers, enter the tenth: ");
        int ten = myScan.nextInt();
        
        int sum = fir + sec + thi + fou + fif + six + sev + eig + nin + ten;
        double sumDoub = (double) sum;
        
        double average = averageSum(sumDoub);
        
        double median = calculateMed(fif,six);
        
        finalResult(average, median);
        
    }
    
    //add additional method
    public static double averageSum(double sumDoub){
        return sumDoub/10;
    }
    public static double calculateMed(int fif,int six){
        return (double) (fif + six)/2;
    }
    public static void finalResult(double average, double median){
        System.out.println("Average is " + average + ", and median is " + median);
    }
}