package ch5_more_data_types_and_operators;

/**
 * Created by ptran on 6/12/2017.
 */
public class Search {
    public static void main(String args[]){
        int array[] = {1, 2, 3, 5, 2, 12, 4, 100};
        for(int x: array){
            if(x == 5){
                System.out.println("5 is in the array");
            }
        }
    }
}
