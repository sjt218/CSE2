//Salvador Joshua Tarun III
//test Java Program
//
//Compile program first
//Use javac test.java in the command prompt
//Run the program
//Uses java test
//git add .
//git commit -m "finished"
//git push -u

//Will bring in a Scanner for the user to input data
import java.util.Scanner;
//Define a class
public class test{
public static int addAll() {
    int i =1;
    int j = 0;
    while(i <10){
     j = j +i;
     if(i == 5){
       return j;
     }
     i++;
    }
    return i + j;
  }
  public static void main(String args[]) {
    System.out.println(addAll());
  }
}