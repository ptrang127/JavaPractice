package ch3_program_control_statements;

/**
 * Created by ptran on 6/6/2017.
 */
public class ForStop {
    public static void main(String args[])
        throws java.io.IOException{

        int i;
        System.out.println("Press S to stop.");

        for(i = 0; (char) System.in.read() != 'S'; i++){
            System.out.println("Pass #" + i);
        }
    }
}
