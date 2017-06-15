package ch6_a_closer_look_at_methods_and_classes;

/**
 * Created by ptran on 6/15/2017.
 */
class MyClass{
    private int alpha; // private
    public int beta; // public
    int gamma; // default access

    /* Methods to access variables */
    void setAlpha(int a){
        alpha = a;
    }
    int getAlpha(){
        return alpha;
    }
}
public class PrivateVsPublic {
    public static void main(String args[]) {
        MyClass obj = new MyClass();
        obj.beta = 1;
        obj.gamma = 2;
        obj.setAlpha(5);
        System.out.println(obj.getAlpha());
    }
}
