package ch4_introducing_classes_objects_and_methods;

/**
 * Created by ptran on 6/9/2017.
 */
public class VehicleMethod {
    public static void main(String args[]){

        Vehicle minivan = new Vehicle();
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        minivan.range();
        int range1 = minivan.range();
        System.out.println(range1);
    }
}
