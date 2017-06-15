package ch3_program_control_statements;

/**
 * Created by ptran on 6/6/2017.
 */
public class ContinueDemo {
    public static void main(String args[]){

        // print even numbers from 1 to 100
        for(int i = 1; i <=100; i++){
            if((i % 2) != 0) continue;
            // continue goes to next iteration
            System.out.println(i);
        }
    }
}
