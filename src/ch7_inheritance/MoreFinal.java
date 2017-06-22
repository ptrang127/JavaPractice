package ch7_inheritance;

/**
 * Created by ptran on 6/22/2017.
 */
class ErrorMsg {
    // final variables are usually capitalized
    final int OUTERR = 0;
    final int INERR = 1;
    final int DISKERR = 2;
    final int INDEXERR = 3;

    String msg[] = {"Output error", "Input error", "Disk full",
    "Index out of bounds"};

    String getErrorMsg(int i) {
        if(i >= 0 & i < msg.length) {
            return msg[i];
        } else {
            return "invalid error code";
        }
    }
}
public class MoreFinal {
    public static void main(String args[]) {
        ErrorMsg err = new ErrorMsg();

        System.out.println(err.getErrorMsg(err.OUTERR));
        System.out.println(err.getErrorMsg(err.INDEXERR));
    }
}

