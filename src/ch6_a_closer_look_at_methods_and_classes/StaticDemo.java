package ch6_a_closer_look_at_methods_and_classes;

/**
 * Created by ptran on 6/19/2017.
 */
class StaticD {
    int x; // normal instance variable
    static int y; // static variable. a copy of y for all objects to share

    int sum() {
        return x + y;
    }
}
public class StaticDemo {
    public static void main(String args[]){
        StaticD ob1 = new StaticD();
        StaticD ob2 = new StaticD();

        ob1.x = 10;
        ob2.x = 20;
        StaticD.y = 19;
        System.out.println(ob2.y);
        ob2.y = 5;
        System.out.println(ob2.y + " " + ob1.y);
    }
}
