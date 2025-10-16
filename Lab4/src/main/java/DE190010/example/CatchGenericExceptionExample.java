package DE190010.example;

import java.util.logging.Logger;

public class CatchGenericExceptionExample {
    private static final Logger logger = Logger.getLogger(CatchGenericExceptionExample.class.getName());

    public static void main(String[] args) {
        try {
            String s = null;
            logger.info(() -> "String length: " + s.length());
        } catch (Exception e) {
            logger.info("Something went wrong" + e);
        }
    }
}