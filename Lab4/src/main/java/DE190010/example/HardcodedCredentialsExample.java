package DE190010.example;

import java.util.Scanner;
import java.util.logging.Logger;

public class HardcodedCredentialsExample {
    private static final Logger logger = Logger.getLogger(HardcodedCredentialsExample.class.getName());

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            logger.info("Enter username: ");
            String username = scanner.nextLine();

            logger.info("Enter password: ");
            String password = scanner.nextLine();

            if (authenticate(username, password)) {
                logger.info("Access granted");
            } else {
                logger.warning("Access denied");
            }
        }
    }

    private static boolean authenticate(String username, String password) {
        // Dummy authentication logic
        return username.equals("admin") && password.equals("123456");
    }
}