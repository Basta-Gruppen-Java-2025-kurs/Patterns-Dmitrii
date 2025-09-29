public class ObserverPattern {
    public static void news() {
        NewsAgency morningDose = new NewsAgency("Morning Dose");
        NewsAgency afternoonPost = new NewsAgency("Afternoon Post");

        ReaderObserver alice = new ReaderObserver("Alice");
        ReaderObserver bob = new ReaderObserver("Bob");
        AnalystObserver charlie = new AnalystObserver("Charlie", s -> (s.length() > 20 ? "Longer than twenty characters" : "Up to twenty characters"));
        AnalystObserver doris = new AnalystObserver("Doris", s -> s.toLowerCase().chars().mapToObj(c -> (char) c).toList().stream().filter(c -> c == 'a').count() + " letters 'a'");

        morningDose.register(alice);
        morningDose.register(charlie);
        morningDose.register(doris);
        afternoonPost.register(bob);
        afternoonPost.register(doris);
        afternoonPost.register(charlie);

        morningDose.postNews("Hello subscribers!");
        afternoonPost.postNews("All subscribers are welcome to read this newspaper!");
        morningDose.postNews("We only have 3 subscribers. We need more");
        afternoonPost.postNews("Well done.");
    }
}
