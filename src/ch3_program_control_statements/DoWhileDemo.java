package ch3_program_control_statements;

/**
 * Created by ptran on 6/6/2017.
 */
public class DoWhileDemo {
    public static void main(String args[])
        throws java.io.IOException {

        char ch, ignore, answer = 'k';
        do {
            System.out.println("Press a key followed by ENTER: ");
            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if(ch == answer){
                System.out.println("RIGHT!");
            } else if(ch < answer){
                System.out.println("Sorry, you're too low");
            } else if(ch > answer){
                System.out.println("Sorry, you're too high");
            }
        } while (ch != answer);
    }
}
