package ch5_more_data_types_and_operators;

/**
 * Created by ptran on 6/12/2017.
 */
public class TwoDArrayInit {
    public static void main(String args[]){
        int squares[][] = {
                {1, 1,},
                {2, 4},
                {3, 9},
                {4, 16},
                {5, 25},
                {6, 36},
                {7, 49},
                {8 , 64},
                {9, 81},
                {10, 100}
        };
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 2; j++) {
                System.out.print(squares[i][j] + " ");
            }

            System.out.print("\n");
        }
    }
}
