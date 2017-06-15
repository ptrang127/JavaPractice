package ch5_more_data_types_and_operators;

/**
 * Created by ptran on 6/15/2017.
 */
public class ShowBits {
    public static void main(String argsp[]){
        int t;
        byte val;

        val = 123;
        for(t = 128; t > 0; t = t/2){
            if ((val & t) != 0) {
                System.out.print("1 ");
            } else{
                System.out.print("0 ");
            }
        }
    }
}
