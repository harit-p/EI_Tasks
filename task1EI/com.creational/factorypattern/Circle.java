import java.util.logging.Logger;

public class Circle implements Shape {
    private static final Logger logger = Logger.getLogger(Circle.class.getName());

    @Override
    public void draw() {
        logger.info("Drawing a Circle");
    }
}
