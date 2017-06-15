package ch4_introducing_classes_objects_and_methods;

/**
 * Created by ptran on 6/8/2017.
 */

public class TwoVehicles {
    public static void main(String args[]){
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        int range1 = minivan.fuelcap * minivan.mpg;
        int range2 = sportscar.fuelcap * sportscar.mpg;

        System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range1);
        System.out.println("Sportscar can carry " + sportscar.passengers + " with a range of " + range2);
    }
}
