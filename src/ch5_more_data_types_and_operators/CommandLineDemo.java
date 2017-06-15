package ch5_more_data_types_and_operators;

/**
 * Created by ptran on 6/15/2017.
 */
public class CommandLineDemo {
    public static void main(String args[]){
        System.out.println("There are " + args.length + " command-line arguments.");
        System.out.println("They are: ");
        for(int i = 0; i < args.length; i++){
            System.out.println("args[" + i + "]: " + args[i]);
        }
    }
}
