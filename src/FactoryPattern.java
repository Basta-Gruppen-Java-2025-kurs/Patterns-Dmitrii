public class FactoryPattern {
    static void shapes(Logger logger) {
        for (String shapeName : new String[]{"square", "circle", "rectangle", "quadrilateral"}) {
            try {
                logger.log("Creating a " + shapeName);
                Shape shape = ShapeFactory.createShape(shapeName);
                assert shape != null : "Failed to create " + shapeName;
                shape.draw(logger);
            } catch (Exception e) {
                logger.log("Error: " + e);
            }
        }
    }
}
