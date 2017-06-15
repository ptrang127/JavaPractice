package ch3_program_control_statements;

/**
 * Created by ptran on 6/6/2017.
 */
public class Help2 {
    public static void main(String args[])
            throws java.io.IOException{
        char choice;
        System.out.println("Help on:");
        System.out.println("\t1. if");
        System.out.println("\t2. switch");
        System.out.println("\t3. for");
        System.out.println("\t4. while");
        System.out.println("\t5. do-while");
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
            case '3':
                System.out.println("The for: \nfor(init; condition; iteration)\n\tstatement;");
                break;
            case '4':
                System.out.println("The while:\nwhile(condition)\n\tstatement;");
                break;
            case '5':
                System.out.println("The do-while:\ndo {\n\tstatement;\n} while (condition);");
                break;
            default:
                System.out.println("That is not a valid option.");
        }
    }
}