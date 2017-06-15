package ch3_program_control_statements;

/**
 * Created by ptran on 6/6/2017.
 */
public class Help {
    public static void main(String args[])
        throws java.io.IOException{
        char choice;
        System.out.println("Help on:");
        System.out.println("\t1. if");
        System.out.println("\t2. switch");
        System.out.println("Choose one: ");
        choice = (char) System.in.read();

        System.out.print("\n");
        switch(choice){
            case '1':
                System.out.println("The if:\nif(condition)\n\tstatement;\nelse\n\tstatement;");
                break;
            case '2':
                System.out.println("The switch:\nswitch(expression){\n\tcase constant:\n\tstatement sequence\n\tbreak;\n\t// ...\n}");
                break;
            default:
                System.out.println("That is not a valid option.");
        }




    }
}
