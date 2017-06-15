package ch4_introducing_classes_objects_and_methods;

/**
 * Created by ptran on 6/9/2017.
 */
class FDemo{
    int x;

    FDemo(int i){
        x = i;
    }
    // finalize method
    protected void finalize(){
        System.out.println("Finalizing " + x);
    }
    // a generator to make bunch of FDemos
    void generator(int i){
        FDemo o = new FDemo(i);
    }
}
public class FinalizeDemo {
    public static void main(String args[]){
        FDemo ob = new FDemo(0);
        // make a bunch of FDemo objects to show how finalize works
        for(int count = 1; count < 1000000; count++){
            ob.generator(count);
        }
    }
}
