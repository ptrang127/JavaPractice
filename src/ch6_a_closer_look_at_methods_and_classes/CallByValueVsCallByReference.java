package ch6_a_closer_look_at_methods_and_classes;

/**
 * Created by ptran on 6/15/2017.
 */
class Test{

    int a, b;

    Test(int i, int j){
        a = i;
        b = j;
    }
    void noChange(int i, int j){
        i = i + j;
        j = -j;
    }
    void change(Test object){
        object.a = object.a + object.b;
        object.b = -object.b;
    }

}
public class CallByValueVsCallByReference {
    public static void main(String args[]){
            Test ob = new Test();
            int a = 15, b = 20;
            System.out.println("a and b before " + a + " " + b);
            ob.noChange(a, b);
            System.out.println("a and b after " +a + " " + b);
    }
}
