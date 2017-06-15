package ch5_more_data_types_and_operators;

/**
 * Created by ptran on 6/12/2017.
 */
public class ArrayDemo {
    public static void main(String args[]){
        int sample[] = new int[10];

        for(int i = 0; i < 10; i++){
            sample[i] = i;
        }
        for(int j = 0; j < 10; j++){
            System.out.println("This is sample[" + j + "]: " + sample[j]);
        }
    }
}
