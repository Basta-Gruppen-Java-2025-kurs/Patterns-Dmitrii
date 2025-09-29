public class FixedDiscount implements DiscountStrategy {

    private final double discount;
    public FixedDiscount(double discount) throws InstantiationException {
        if (discount<0) throw new InstantiationException("Discount cannot be negative");
        this.discount = discount;
    }
    @Override
    public double applyDiscount(double price) {
        return Math.max(0, price - discount);
    }
    @Override
    public String toString() {
        return "fixed discount: " + discount;
    }
}
