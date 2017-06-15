package ch5_more_data_types_and_operators;

/**
 * Created by ptran on 6/12/2017.
 */

// queue class FIFO
class Queue{
    char q[];
    int putloc, getloc;

    Queue(int size){
        q = new char[size];
        putloc = getloc = 0;
    }

    // put into queue
    void put(char ch){
        if(putloc == q.length){
            System.out.println(" - Queue is full.");
            return;
        }
        q[putloc++] = ch;
    }
    // get item from queue
    char get(){
        if(getloc == putloc){
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }
}
public class QueueDemo {
    public static void main(String args[]){
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch; // character
        int i; // index

        System.out.println("Using bigQ to store the alphabet.");
        for(i = 0; i < 102; i++){
            System.out.println("Attempting to store " + (char) ('A' + i));
            bigQ.put((char) ('A' + i));
        }

        System.out.print("Contents of bigQ: ");
        for(i = 0; i < 26; i++){
            ch = bigQ.get();
            if(ch != (char) 0){
                System.out.print(ch);
            }
        }

        System.out.println("\nNow using smallQ to generate errors.");
        for(i = 0; i < 5; i++){
            System.out.print("Attempting to store " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.print("\n");
        }
        System.out.print("\n");

        System.out.print("Contents of smallQ: ");
        for(i = 0; i < 5; i++){
            ch = smallQ.get();
            if(ch != (char) 0){
                System.out.print(ch);
            }
        }

    }

}
