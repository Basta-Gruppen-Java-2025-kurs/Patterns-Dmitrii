public class NoDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price;
    }
    @Override
    public String toString() {
        return "no discount";
    }
}
