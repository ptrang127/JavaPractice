package ch5_more_data_types_and_operators;

/**
 * Created by ptran on 6/12/2017.
 */
public class StringArrays {
    public static void main(String args[]){
        String strs[] = {"This", "is", "a", "test."};

        System.out.println("Original array: ");
        for(String s: strs){
            System.out.print(s + " ");
        }
        System.out.print("\n");

        // change a string

        strs[1] = "was";
        strs[3] = "test, too!";

        System.out.println("Modified array: ");
        for(String s : strs){
            System.out.print(s + " ");
        }
    }
}
