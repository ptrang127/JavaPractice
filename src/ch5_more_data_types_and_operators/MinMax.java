package ch5_more_data_types_and_operators;

/**
 * Created by ptran on 6/12/2017.
 */
public class MinMax {
    public static void main(String args[]) {
        int nums[] = new int[10];

        int min, max;

        nums[0] = 99;
        nums[1] = -10;
        nums[2] = 1000232;
        nums[3] = 18;
        nums[4] = 4;
        nums[5] = -20000;
        nums[6] = 4322;
        nums[7] = 65;
        nums[8] = 432;
        nums[9] = 2;

        min = max = nums[0];

        for (int i = 0; i < 10; i++) {
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
