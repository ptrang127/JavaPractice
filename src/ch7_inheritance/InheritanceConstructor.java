package ch7_inheritance;

/**
 * Created by ptran on 6/21/2017.
 */
class TwoDShape2 {
    private int width;
    private int length;
    void setWidth(int w){
        width = w;
    }
    void setLength(int l){
        length = l;
    }
    int getWidth() {
        return width;
    }
    int getLength() {
        return length;
    }
}
class Rectangle extends TwoDShape2 {
    Rectangle(int w, int l) {
        setWidth(w);
        setLength(l);
    }
    int area() {
        return  getLength() * getWidth();
    }
}
public class InheritanceConstructor {
    public static void main(String args[]){
        Rectangle r1 = new Rectangle(2, 5);
        System.out.println("Area is " + r1.area());
    }

}
