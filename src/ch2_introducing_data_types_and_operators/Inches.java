package ch2_introducing_data_types_and_operators;

/*
when you need an integer that has a range greater than int, use long
 */
public class Inches {
    public static void main(String args[]){

        long ci;
        long im;
        im = 5280*12;
        ci = im * im * im;

        System.out.println("There are " + ci + " cubic inches in cubic mile.");



    }
}
