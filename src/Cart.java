public class Cart {
    private DiscountStrategy discountStrategy = new NoDiscount();
    private double price;

    public void setPrice(double price) {
        this.price = price;
    }
    public void pay(Logger logger) {
        logger.log("The price is " + price);
        logger.log("Current discount is " + discountStrategy);
        logger.log("The price with discount is " + discountStrategy.applyDiscount(price));
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

}
