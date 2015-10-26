//Salvador Joshua Tarun III
//areas Java Program
//
//Compile program first
//Use javac areas.java in the command prompt
//Run the program
//Uses java areas
//git add .
//git commit -m "finished"
//git push -u

//Will bring in a Scanner for the user to input data
import java.util.Scanner;
import java.util.Random;
//Define a class
public class areas{
   
    // add main method
    public static void main(String[] args) {
        boolean go = true;
        while(go == true){
            //Creates Scanner and prompts question, not on a' new line for the input
            Scanner myScan = new Scanner( System.in );
            double length, width, height, area = 0;
            String check, shape, c = "circle", r = "rectangle", t = "trapezoid", n = "n", N = "N";
            System.out.print("Type either circle, rectangle or trapezoid, depending on desired calculation: ");
            //Looks for shape
            shape = myScan.next();
            if(shape.equals(c) || shape.equals(r) || shape.equals(t)){
                if(shape.equals(c)){
                    System.out.print("Enter radius: ");
                    length = myScan.nextDouble();
                    area = area(length);
                }
                if(shape.equals(r)){
                    System.out.print("Enter length: ");
                    length = myScan.nextDouble();
                    System.out.print("Enter width: ");
                    width = myScan.nextDouble();
                    area = area(length, width);
                }
                if(shape.equals(t)){
                    System.out.print("Enter base 1: ");
                    length = myScan.nextDouble();
                    System.out.print("Enter base 2: ");
                    width = myScan.nextDouble();
                    System.out.print("Enter height: ");
                    height = myScan.nextDouble();
                    area = area(length, width, height);
                }
                System.out.println("The area is " + area + ".");
                System.out.println("Type n or N to stop.");
                check = myScan.next();
                if(check.equals(n) || check.equals(N)){
                    go = false;
                }
            }
        }
    }
    
    //add additional method
    public static double area(double length){
        double area = length * length * 3.14159;
        return area;
    }
    //add additional method
    public static double area(double length, double width){
        double area = length * width;
        return area;
    }
    //add additional method
    public static double area(double length, double width, double height){
        double area = (length + width) / 2 * height;
        return area;
    }
}
