package ch4_introducing_classes_objects_and_methods;

/**
 * Created by ptran on 6/8/2017.
 */
public class Vehicle {

    int passengers;
    int fuelcap;
    int mpg;

    int range(){
        System.out.println("Range is " + fuelcap * mpg);
        return fuelcap * mpg;
    }
}
