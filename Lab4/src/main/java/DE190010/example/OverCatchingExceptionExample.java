package DE190010.example;

import java.util.logging.Logger;

public class OverCatchingExceptionExample {
    private static final Logger logger = Logger.getLogger(OverCatchingExceptionExample.class.getName());

    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            logger.info(() -> "Index 10: " + arr[10]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            logger.severe("Runtime error" + ex);
        }
    }
}