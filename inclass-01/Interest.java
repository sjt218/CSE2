//Salvador Joshua Tarun III
//Interest Java Program
//
//Compile program first
//Use javac Interest.java in the command prompt
//Run the program
//Uses java Interest

//Define a class
public class Interest{
   
    // add main method
    public static void main(String[] args) {
        double balance;
        double interestRate;
        double interest;
        double sum;
        
        balance = 670;
        interestRate = .08;
        interest = balance * interestRate;
        sum = balance + interest;
        
        System.out.println("Your balance is " + balance + " and the interest rate is " + interestRate + ". Your new balance is " + sum);
        
        
    }  
}