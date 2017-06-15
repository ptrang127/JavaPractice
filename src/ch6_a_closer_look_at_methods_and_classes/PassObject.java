package ch6_a_closer_look_at_methods_and_classes;

/**
 * Created by ptran on 6/15/2017.
 */
class Block {
    int a, b, c;
    int volume;

    Block(int i, int j, int k){
        a = i;
        b = j;
        c = k;
        volume = a*b*c;
    }
    boolean sameBlock(Block object){
        if((object.a == a) & (object.b == b) & (object.c == c)){
            return true;
        } else{
            return false;
        }
    }

    boolean sameVolume(Block object){
        if(object.volume == volume){
            return true;
        } else {
            return false;
        }
    }

}
public class PassObject {
    public static void main(String args[]){
        Block ob1 = new Block(10, 2, 5);
        Block ob2 = new Block(10, 2, 5);
        Block ob3 = new Block(4, 5,5);

        System.out.println("ob1 same dimensions as ob2: " + ob1.sameBlock(ob2));
        System.out.println("ob1 same dimensions as ob3: " + ob1.sameBlock(ob3));
        System.out.println("ob1 same volume as ob3: " + ob1.sameVolume(ob3));
    }
}
