public class ReaderObserver implements Observer {
    private final String name;
    ReaderObserver(String name) {
        this.name = name;
    }
    @Override
    public void update(String news, String agencyName) {
        System.out.println("Reader \033[1m" + name + "\033[22m; got the news from \033[1m" + agencyName + "\033[22m: '" + news + "'");
    }
}
