//Salvador Joshua Tarun III
//sort Java Program
//
//Compile program first
//Use javac sort.java in the command prompt
//Run the program
//Uses java sort
//git add .
//git commit -m "finished"
//git push -u

//Will bring in a Scanner for the user to input data
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
//Define a class
public class sort{
   
    // add main method
    public static void main(String[] args) {
        //Creates Scanner and prompts question, not on a' new line for the input
        Scanner myScan = new Scanner( System.in );
        int rand, sum = 0;
        Random randomGenerator = new Random();
        int[] nums = new int[20];
        int[] nums2 = new int[10];
        int[] nums3 = new int[nums.length + nums2.length];
        
        
        for (int i = 0; i < 20; i++){
            rand = randomGenerator.nextInt(101);
            nums[i] = rand;
        }
        for (int i = 0; i < 10; i++){
            rand = randomGenerator.nextInt(101);
            nums2[i] = rand;
        }
        
        for (int i = 0; i < nums.length; i++){
            for(int j = 1; j < nums.length; j++){
                int n;
                if(nums[j] < nums[j-1]){
                    n = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = n;
                }
            }
        }
        for (int i = 0; i < nums2.length; i++){
            for(int j = 1; j < nums2.length; j++){
                int k;
                if(nums2[j] < nums2[j-1]){
                    k = nums2[j-1];
                    nums2[j-1] = nums2[j];
                    nums2[j] = k;
                }
            }
        }
        
        System.out.println("Array 1: " + Arrays.toString(nums));
        System.out.println("Array 2: " + Arrays.toString(nums2));
        
        for (int i = 0; i < nums3.length; i++){
            if(i < nums.length){
                nums3[i] = nums[i];
            }
            else{
                nums3[i] = nums2[i-nums.length];
            }
        }
        
        for (int i = 0; i < nums3.length; i++){
            for(int j = 1; j < nums3.length; j++){
                int k;
                if(nums3[j] < nums3[j-1]){
                    k = nums3[j-1];
                    nums3[j-1] = nums3[j];
                    nums3[j] = k;
                }
            }
        }
        System.out.println("Array 3: " + Arrays.toString(nums3));
    }
}
