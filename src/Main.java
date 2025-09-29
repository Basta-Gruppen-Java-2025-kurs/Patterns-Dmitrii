import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        try {
            File f = new File("log.txt");
            boolean fileCreated = !f.exists() && f.createNewFile();
            FileWriter fw = new FileWriter(f, true);
            logger.log("App started. Using Logger singleton").log("Turning on datetime").useTimestamp(true)
                    .log("Current timestamp is here").log(fileCreated ? "New log file created" : "Log file already exists")
                    .setPrintWriter(new PrintWriter(fw)).log("Logging to file").useTimestamp(false)
                    .log("Turned off timestamps").setPrintWriter(new PrintWriter(System.out))
                    .log("Ended logging to file");

            for (String shapeName : new String[] {"square", "circle", "rectangle", "quadrilateral"}) {
                try {
                    logger.log("Creating a " + shapeName);
                    Shape shape = ShapeFactory.createShape(shapeName);
                    assert shape != null : "Failed to create " + shapeName;
                    shape.draw();
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            }

            ObserverPattern.news();

            StrategyPattern.shop();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
