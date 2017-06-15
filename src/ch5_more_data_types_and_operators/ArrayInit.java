package ch5_more_data_types_and_operators;

/**
 * Created by ptran on 6/12/2017.
 */
public class ArrayInit {
    public static void main(String args[]){

        int nums[] = {99 , 22, 1432, -999, 431};

        int min = nums[0];
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("min and max: " + min + " " + max);
    }
}
