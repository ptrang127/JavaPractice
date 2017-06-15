package ch3_program_control_statements;

/**
 * Created by ptran on 6/6/2017.
 */
public class KeyboardIn {
    public static void main(String args[])
        throws java.io.IOException{

        char ch;
        System.out.println("Enter a key followed by ENTER: ");

        ch = (char) System.in.read();

        System.out.println("Your key is " + ch);



    }
}
