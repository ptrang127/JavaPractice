package ch4_introducing_classes_objects_and_methods;

/**
 * Created by ptran on 6/9/2017.
 */
public class EvenDemo {
    public static void main(String args[]){
        CheckNum number = new CheckNum();

        if(number.isEven(20)) {
            System.out.println("20 is even");
        }

        if(number.isEven(5)){
            System.out.println("5 is even");
        }
    }
}
