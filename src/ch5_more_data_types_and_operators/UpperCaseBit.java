package ch5_more_data_types_and_operators;

/**
 * Created by ptran on 6/15/2017.
 */
public class UpperCaseBit {
    public static void main(String args[]){
        char ch;
        for(int i = 0; i < 10; i++){
            ch = (char) ('a' + i);
            System.out.print(ch);
            // 65504 is 111111111101 in binary
            ch = (char) ((int) ch & 65503);
            System.out.print(ch + " ");
        }
    }
}
