package DE190010.example;

import java.util.logging.Logger;

interface Shape {
    void draw();
    void resize();
}

class Square implements Shape {
    private static final Logger logger = Logger.getLogger(Square.class.getName());

    @Override
    public void draw() {
        logger.info("Drawing a square");
    }

    @Override
    public void resize() {
        logger.info("Resizing a square");
    }
}