package ch5_more_data_types_and_operators;

/**
 * Created by ptran on 6/12/2017.
 */
public class StringDemo {
    public static void main(String args[]){

        String str1 = new String("Java strings are objects.");
        String str2 = "They are constructed various ways";
        String str3 = new String(str2);

        System.out.println(str2);
        System.out.println(str3);

        str3 = str2;
        str3 = "hello";

        System.out.println(str3);
    }
}
