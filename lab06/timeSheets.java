//Salvador Joshua Tarun III
//timeSheets Java Program
//
//Compile program first
//Use javac timeSheets.java in the command prompt
//Run the program
//Uses java timeSheets

//Will bring in a Scanner for the user to input data
import java.util.Scanner;
//Define a class
public class timeSheets{
   
    // add main method
    public static void main(String[] args) {
        int totalOneInt, totalAllInt;
        double totalOne, totalAll = 0, pay;
        boolean go = true;
        //Creates Scanner and prompts question, not on a new line for the input
        Scanner myScan = new Scanner( System.in );
        System.out.print("Enter number of employees: ");
        
        //Creates first int
        int employees = myScan.nextInt();

        for(int i = 1; i <= employees; i++){
            //Prompts the user for hours on Monday
            System.out.print("Enter Monday hours: ");
            double Mon = myScan.nextDouble();
        
            //Prompts the user for hours on Tuesday
            System.out.print("Enter Tuesday hours: ");
            double Tues = myScan.nextDouble();
        
            //Prompts the user for hours on Wednesday
            System.out.print("Enter Wednesday hours: ");
            double Wed = myScan.nextDouble();
            
            //Prompts the user for hours on Thursday
            System.out.print("Enter Thursday hours: ");
            double Thurs = myScan.nextDouble();
            
            //Prompts the user for hours on Friday
            System.out.print("Enter Friday hours: ");
            double Fri = myScan.nextDouble();
            //Prompts the user for payrate
            System.out.print("Enter pay per hour: ");
            pay = myScan.nextDouble();
            
            totalOne = (Mon + Tues + Wed + Thurs + Fri) * pay;
            totalAll += totalOne;
            
            totalOneInt = (int) (totalOne * 100);
            System.out.println("This employee should be paid $" + (totalOneInt/100) + "." + ((totalOneInt/10)%10) + (totalOneInt%10) + ". ");
        }
        
        totalAllInt = (int) (totalAll * 100);
        System.out.println("The total payroll of all employees is $" + (totalAllInt/100) + "." + ((totalAllInt/10)%10) + (totalAllInt%10) + ". ");
    }  
}