package ch5_more_data_types_and_operators;

/**
 * Created by ptran on 6/12/2017.
 */
public class StringOperations {
    public static void main(String args[]){
        String str1 = "When it comes to Web programming, Java is #1.";
        String str2 = new String(str1);
        String str3 = "Java strings are powerful.";
        int result, idx;
        char ch;

        System.out.println("Length of str1: " + str1.length());
        for(int i = 0; i < str3.length(); i++){
                System.out.print(str3.charAt(i));
        }
        System.out.print("\n");

        // compareTO
        // indexOf
        // lastIndexOf

        str2 = "hello my old friend";
        System.out.println(str2.lastIndexOf("old"));
    }
}
