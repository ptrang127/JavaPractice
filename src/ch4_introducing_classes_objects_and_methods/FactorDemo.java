package ch4_introducing_classes_objects_and_methods;

/**
 * Created by ptran on 6/9/2017.
 */
class Factor{

    boolean isFactor(int a, int b){
        if((a % b) == 0){
            return true;
        } else {
            return false;
        }
    }

}
public class FactorDemo {
    public static void main(String args[]){
        Factor x = new Factor();

        System.out.println(x.isFactor(10,2));
        System.out.println(x.isFactor(10,3));
    }
}
