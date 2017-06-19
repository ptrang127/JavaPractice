package ch6_a_closer_look_at_methods_and_classes;

/**
 * Created by ptran on 6/19/2017.
 */
class Outer {

    int nums[];

    Outer(int n[]) {
        nums = n;
    }
    void analyze() {
        Inner inOb = new Inner();
        System.out.println("minimum: " + inOb.min());
        System.out.println("maximum: " + inOb.max());
        System.out.println("average: " + inOb.avg());
    }

    class Inner {
        int m = nums[0];
        int min() {
            for(int i = 0; i < nums.length; i++){
                if(nums[i] < m){
                    m = nums[i];
                }
            }
            return m;
        }
        int max() {
            for(int i = 0; i < nums.length; i++){
                if(nums[i] > m){
                    m = nums[i];
                }
            }
            return m;

        }
        int avg() {
            int a = 0;
            for(int i = 0; i < nums.length; i++){
                a += nums[i];
            }
            a /= nums.length;
            return a;
        }
    }

}
public class NestedClassDemo {
    public static void main(String args[]) {
        int x[] = {3, 2, 1, 5, 6, 7, 9, 8};
        Outer outOb = new Outer(x);
        outOb.analyze();
    }
}
