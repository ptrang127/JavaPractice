package ch3_program_control_statements;

/**
 * Created by ptran on 6/6/2017.
 */
public class SwitchDemo {
    public static void main(String args[]){

        for(int i = 0; i < 10; i++){
            switch(i){
                case 0:
                    System.out.println("i is zero");
                    break;
                case 1:
                    System.out.println("i is one");
                    break;
                case 2:
                    System.out.println("i is two");
                    break;
                case 3:
                    System.out.println("i is three");
                    break;
                case 4:
                    System.out.println("i is four");
                    break;
                default:
                    System.out.println("i is more than 4");
            }
        }
    }
}
