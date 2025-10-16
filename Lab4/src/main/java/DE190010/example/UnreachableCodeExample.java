package DE190010.example;

import java.util.logging.Logger;

public class UnreachableCodeExample {
    private static final Logger logger = Logger.getLogger(UnreachableCodeExample.class.getName());

    static final int NUMBER = 12;

    public static void main(String[] args) {
        logger.info("Number: " + NUMBER);
    }
}
