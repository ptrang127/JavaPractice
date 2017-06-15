package ch5_more_data_types_and_operators;

/**
 * Created by ptran on 6/15/2017.
 */
public class StringSwitch {
    public static void main(String args[]){
        String command = "cancel";
        switch(command){
            case "connect":
                System.out.println("Connecting...");
                break;
            case "cancel":
                System.out.println("Canceling...");
                break;
            case "disconnect":
                System.out.println("Disconnecting...");
                break;
            default:
                System.out.println("Command not found.");
                break;
        }
    }
}
