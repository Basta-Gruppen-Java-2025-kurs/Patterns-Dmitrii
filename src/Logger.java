import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private PrintWriter printWriter;
    private static Logger instance;
    private boolean addTimestamp = false;
    private Logger() {
        printWriter = new PrintWriter(System.out);
    }
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    public Logger log(String logLine) {
        if (addTimestamp) {
            printWriter.print(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ")));
        }
        printWriter.println(logLine);
        printWriter.flush();
        return this;
    }
    public Logger useTimestamp(boolean use) {
        addTimestamp = use;
        return this;
    }
    public Logger setPrintWriter(PrintWriter output) {
        assert output != null : "Cannot write logs to null.";
        printWriter = output;
        return this;
    }
}
