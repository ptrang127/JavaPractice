package ch5_more_data_types_and_operators;

/**
 * Created by ptran on 6/15/2017.
 */
public class SubString {
    public static void main(String argsp[]){
        String original = "Java makes the Web move.";
        String substr = original.substring(5, 18);

        System.out.println("original: " + original);
        System.out.println("substring: " + substr);
    }
}
