import java.util.ArrayList;

public class NewsAgency {
    private final String name;
    private final Logger logger;
    NewsAgency(String name, Logger logger) {
        this.name = name;
        this.logger = logger;
    }
    private final ArrayList<Observer> observers = new ArrayList<>();

    public void postNews(String news) {
        for (Observer o : observers) {
            logger.log(o.update(news, name));
        }
    }

    public void register(Observer observer) {
        observers.add(observer);
    }
}
