package ch1_java_fundamentals;

/**
 * Created by ptran on 6/1/2017.
 */
public class ForDemo {
    public static void main(String args[]) {
        int count;
        for(count = 0; count < 5; count = count + 1){
            System.out.println("This is count : " + count);
        }
        System.out.println("Done!");
    }
}
