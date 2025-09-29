public class ShapeFactory {
    public static Shape createShape(String type) {
        return switch(type) {
            case "square" -> new Square();
            case "circle" -> new Circle();
            case "rectangle" -> new Rectangle();
            default -> null;
        };
    }
}
