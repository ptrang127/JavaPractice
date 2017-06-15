package ch5_more_data_types_and_operators;

/**
 * Created by ptran on 6/12/2017.
 */
public class Bubble {
    public static void main(String args[]){
        int nums[] = {99, -10, 100123, 18, -978, 5263, 463, -9, 287, 49};

        int a, b, t;
        int size;

        System.out.println("The original array is:");
        for(int i = 0; i < nums.length; i ++){
            System.out.print(nums[i] + " ");
        }

        // Bubble sort code
        for(a = 1; a < nums.length; a++){
            for(b = nums.length - 1; b >= a; b--){
                if(nums[b-1] > nums[b]){
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        }

        System.out.println("The sorted array is:");
        for(int i = 0; i < nums.length; i ++){
            System.out.print(nums[i] + " ");
        }
    }
}
