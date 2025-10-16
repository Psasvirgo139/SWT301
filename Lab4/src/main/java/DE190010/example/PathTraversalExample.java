package DE190010.example;

import java.io.*;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PathTraversalExample {
    private static final Logger logger = Logger.getLogger(PathTraversalExample.class.getName());

    public static void main(String[] args) throws IOException {
        String userInput = "../secret.txt";
        try {
            Path baseDir = new File(".").getCanonicalFile().toPath();
            Path target = baseDir.resolve(userInput).normalize();
            if (!target.startsWith(baseDir)) {
                logger.log(Level.WARNING, "Access to the requested path is denied: {0}", userInput);
                return;
            }
            File file = new File(userInput);
            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                logger.info("Reading file: " + file.getPath());
                reader.close();
            }
        } catch (IOException ex) {
        logger.severe("Error accessing file: " + ex.getMessage());}
    }
}