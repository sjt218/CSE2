//Salvador Joshua Tarun III
//MineSweeper Java Program
//
//Compile program first
//Use javac MineSweeper.java in the command prompt
//Run the program
//Uses java MineSweeper
//git add .
//git commit -m "Finished"
//git push -u

//Will bring in a Scanner for the user to input data
import java.util.Scanner;
import java.util.Random;
//Define a class
public class MineSweeper{
   
    // add main method
    public static void main(String[] args) {
        boolean go = true;
        while(go == true){
            //Creates Scanner and prompts question, not on a new line for the input
            Scanner myScan = new Scanner( System.in );
            String check, n = "n", N = "N", m = "M";
            int x,y,num,M,count;
            Random randomGenerator = new Random();
            
            System.out.print("Enter size of minefield, size between 2 and 30: ");
             //Creates size of array
            num = myScan.nextInt();
            if(num < 2 || num > 30){
                System.out.println("Incorrect.");
                break;
            }
            String[][] field = new String[num][num];
        
            System.out.print("Enter number of mines, at least 1, and less than N*N: ");
            M = myScan.nextInt();
            if(M < 1 || M > num*num){
                System.out.println("Incorrect.");
                break;
            }
            
            for(int i = 0; i < num; i++){
                for(int j = 0; j < num; j++){
                    field[i][j] = "0";
                }
            }
            
            for(int i = 0; i < num; i++){
                for(int j = 0; j < num; j++){
                    System.out.print(" " + field[i][j]);
                }
                System.out.println();
            }
            
            System.out.println();
            
            for(int i = 0; i < M;i++){
                x = randomGenerator.nextInt(num);
                y = randomGenerator.nextInt(num);
                if(field[x][y] == "M"){
                    i--;
                }
                field[x][y] = "M";
            }
            
            for(int i = 0; i < num; i++){
                for(int j = 0; j < num; j++){
                    System.out.print(" " + field[i][j]);
                }
                System.out.println();
            }
            
            System.out.println();
            
            for(int i = 0; i < num; i++){
                for(int j = 0; j < num; j++){
                    count = 0;
                    if(i-1 >= 0){
                        if(m.equals(field[i-1][j])){
                            count++;
                        }
                        if(j-1 >= 0){
                            if(m.equals(field[i-1][j-1])){
                                count++;
                            }
                        }
                        if(j+1 < num){
                            if(m.equals(field[i-1][j+1])){
                                count++;
                            }
                        }
                    }
                    if(i+1 <= num-1){
                        if(m.equals(field[i+1][j])){
                            count++;
                        }
                        if(j-1 >= 0){
                            if(m.equals(field[i+1][j-1])){
                                count++;
                            }
                        }
                        if(j+1 <= num-1){
                            if(m.equals(field[i+1][j+1])){
                                count++;
                            }
                        }
                    }
                    if(j-1 >= 0){
                        if(m.equals(field[i][j-1])){
                            count++;
                        }
                    }
                    if(j+1 <= num-1){
                        if(m.equals(field[i][j+1])){
                            count++;
                        }
                    }
                    if(m.equals(field[i][j]) == false){
                        field[i][j] = Integer.toString(count);
                    }
                }
            }
            
            for(int i = 0; i < num; i++){
                for(int j = 0; j < num; j++){
                    System.out.print(" " + field[i][j]);
                }
                System.out.println();
            }
            
            System.out.println();
            
            System.out.println("Type n or N to stop, or anything else to continue.");
            check = myScan.next();
            if(check.equals(n) || check.equals(N)){
                go = false;
            }
        }
    }  
}