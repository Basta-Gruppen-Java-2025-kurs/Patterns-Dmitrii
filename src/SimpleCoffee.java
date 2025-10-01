public class SimpleCoffee implements Coffee {
    private final double cost;
    private final String description;
    SimpleCoffee(double cost, String description) {
        this.cost = cost;
        this.description = description;
    }
    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
