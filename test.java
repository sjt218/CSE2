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
import java.util.Random;
//Define a class
public class test{
    public static void main(String[] args){
        Random randomGenerator = new Random();
        int rand, j = 0;
        int[] list1 = new int[10];
        for (int i = 0; i < 10; i++){
            rand = randomGenerator.nextInt(23);
            list1[i] =  rand;
        }
        int[] list2 = new int[10];
        for (int i = 0; i < 10; i++){
            if (list1[i] % 2 == 0){
                list2[j] = list1[i];
                j++;
            }
        }
    }
}
