package DE190010.example;

import java.util.logging.Logger;

public class NullPointerExample {
    private static final Logger logger = Logger.getLogger(NullPointerExample.class.getName());

    public static void main(String[] args) {
        String text = null;
        try{
            if (text.isEmpty()) {
                logger.info("Text is not empty");
            }
        } catch (NullPointerException e) {
            logger.severe("Caught NullPointerException: " + e);
        }
    }
}