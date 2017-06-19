package ch6_a_closer_look_at_methods_and_classes;

/**
 * Created by ptran on 6/19/2017.
 */

class factorial {
    int factR(int n) {
        int result;
        if(n ==1) {
            return 1;
        }
        result = factR(n - 1) * n;
        return result;
    }
}
public class RecursionDemo {
    public static void main(String args[]){
        factorial f = new factorial();
        System.out.println("Factorials using recursive method:");
        System.out.println("The factorial of 3 is " + f.factR(3));
    }
}
