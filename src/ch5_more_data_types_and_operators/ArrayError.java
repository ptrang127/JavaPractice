package ch5_more_data_types_and_operators;

/**
 * Created by ptran on 6/12/2017.
 */
public class ArrayError {
    public static void main(String args[]){
        int num[] = {1, 2, 3, 45, 65};

        for(int i = 0; i < 100; i++){
            // should get array index out of bounds exception
            System.out.println(num[i]);
        }
    }
}
