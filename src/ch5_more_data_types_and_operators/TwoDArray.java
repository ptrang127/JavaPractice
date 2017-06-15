package ch5_more_data_types_and_operators;

/**
 * Created by ptran on 6/12/2017.
 */
public class TwoDArray {
    public static void main(String args[]){
        int t, i;
        int table[][] = new int[3][4];

        for(t = 0; t < 3; t++){
            for(i = 0; i < 4; i++){
                table[t][i] = (t * 4) + i + 1;
                if(i != 3){
                    System.out.print(table[t][i] + " ");
                } else {
                    System.out.println(table[t][i]);
                }
            }
        }
    }
}
