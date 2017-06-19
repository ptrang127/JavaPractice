package ch6_a_closer_look_at_methods_and_classes;

/**
 * Created by ptran on 6/16/2017.
 */
// when a class has two methods with same names but different parameters
class overload {
    void ovl(){
        System.out.println("No parameters");
    }

    void ovl(int a){
        System.out.println(a);
    }
}
public class MethodOverload {
    public static void main(String args[]){
        overload obj = new overload();
        obj.ovl();
        obj.ovl(2);
    }
}
