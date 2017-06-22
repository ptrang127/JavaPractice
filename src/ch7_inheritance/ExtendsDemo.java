package ch7_inheritance;

/**
 * Created by ptran on 6/21/2017.
 */
class TwoDShape {
    TwoDShape(double w, double h){
        width = w;
        height = h;
    }
    double width;
    double height;

    void showDim(){
        System.out.println("Width and height are " + width + " and " + height);
    }
}
class Triangle extends TwoDShape {
    Triangle(String s, double w, double h){
        super(w, h);
        style = s;
    }
    String style;
    double area(){
        return width * height / 2;
    }
    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
public class ExtendsDemo {
    public static void main(String args[]){
        Triangle t1 = new Triangle("filled", 4.0, 4.0);
        Triangle t2 = new Triangle("outlined", 8.0, 12.0);

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is: " + t1.area());

        System.out.println();
        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is: " + t2.area());
    }
}
