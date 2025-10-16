package DE190010.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SQLInjectionExample {
    private static final Logger logger = Logger.getLogger(SQLInjectionExample.class.getName());

    public static void main(String[] args) {
        String userInput = "' OR '1'='1";
        String query = "SELECT * FROM users WHERE username = ?";
        //Khai bao connnection
        //Khai bao prepared statement
        //ps.setString(1, userInput);
        logger.info(query);
    }
}