public class PercentageDiscount implements DiscountStrategy {

    private final double discountPercentage;

    public PercentageDiscount(double discount) throws InstantiationException {
        if (discount > 1) throw new InstantiationException("Discount cannot be more than 100%");
        if (discount < 0) throw new InstantiationException("Discount cannot be negative!");
        this.discountPercentage = discount;
    }

    @Override
    public double applyDiscount(double price) {
        return price * (1 - discountPercentage);
    }
    @Override
    public String toString() {
        return "percentage discount: " + discountPercentage;
    }
}
