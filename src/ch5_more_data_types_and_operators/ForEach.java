package ch5_more_data_types_and_operators;

/**
 * Created by ptran on 6/12/2017.
 */
public class ForEach {
    public static void main(String args[]){
        int nums[] = {1, 4, 6, 1, 3, 6, 7, 123, 32};
        int sum = 0;
        for(int x : nums){
            sum += x;
        }
        System.out.print(sum);
    }

}
