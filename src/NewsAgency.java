import java.util.ArrayList;

public class NewsAgency {
    private final String name;
    NewsAgency(String name) {
        this.name = name;
    }
    private final ArrayList<Observer> observers = new ArrayList<>();

    public void postNews(String news) {
        for (Observer o : observers) {
            o.update(news, name);
        }
    }

    public void register(Observer observer) {
        observers.add(observer);
    }
}
