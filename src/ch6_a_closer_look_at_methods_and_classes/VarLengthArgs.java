package ch6_a_closer_look_at_methods_and_classes;

/**
 * Created by ptran on 6/19/2017.
 */
/*
    static void vaTest(int ... v) {

*/
class VarLengthArgs {
    static void vaTest(int ... v) {
        System.out.println("Number of args: " + v.length);
        System.out.println("Contents: ");
        for(int i = 0; i < v.length; i++) {
            System.out.println("arg[" + i + "]: " + v[i]);
        }
    }
    static void vaTest(boolean ... v) {
        System.out.println("Number of args: " + v.length);
        System.out.println("Contents: ");
        for(int i = 0; i < v.length; i++) {
            System.out.println("arg[" + i + "]: " + v[i]);
        }
    }
    static void vaTest(String msg, int ... v) {
        System.out.println(msg);
        System.out.println("Number of args: " + v.length);
        System.out.println("Contents: ");
        for(int i = 0; i < v.length; i++) {
            System.out.println("arg[" + i + "]: " + v[i]);
        }
    }

    public static void main(String args[]) {
        vaTest(1);
        vaTest(0,1, 1);
        vaTest("hello", 1);
    }
}

