//Salvador Joshua Tarun III
//Global Java Program
//
//Compile program first
//Use javac Global.java in the command prompt
//Run the program
//Uses java Global

//git add .
//git commit -m "finished"
//git push -u

//Will bring in a Scanner for the user to input data
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

//Define a class
public class Global{
    public static double w;
    public static double h;
        // add main method
    public static void main(String[] args) {
        Global x = new Global();
        x.setWidth(3);
        x.setHeight(4);
        System.out.println(x.getArea());
        
        
    }
    public void setWidth(double x){
        Global.w = x;
    }
    public void setHeight(double x){
        Global.h = x;
    }
    public double getArea(){
        double area = Global.w * Global.h;
        return area;
    }
}