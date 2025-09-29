import java.util.function.Function;

public class AnalystObserver implements Observer {
    private final String name;
    private final Function <String, String> analyze;
    AnalystObserver(String name, Function<String,String> analysisFunction) {
        this.name = name;
        this.analyze = analysisFunction;
    }

    @Override
    public void update(String news, String agencyName) {
        System.out.println("Analyst \033[1m" + name + "\033[22m received the news from \033[1m" + agencyName + "\033[22m: '" + news + "'");
        System.out.println("Analysis: \033[3m" + analyze.apply(news) + "\033[23m");
    }
}
