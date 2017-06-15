package ch3_program_control_statements;

/**
 * Created by ptran on 6/6/2017.
 */
public class BreakDemo {
    public static void main(String args[]){
        int num = 100;
        for(int i = 0; i < 100; i++){
            System.out.println(i);
            if(i*i >= num){
                break;
            }
        }
        System.out.println("Loop complete");
    }
}
