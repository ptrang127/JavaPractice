package ch2_introducing_data_types_and_operators;

/*
using doubles for pythagorean
 */
public class Hypot {
    public static void main(String args[]){

        double x, y, z;
        x = 3;
        y = 4;
        z = Math.sqrt(x*x + y*y);

        System.out.println("Hypotenuse is " + z);
    }
}
