public class Cart {
    private DiscountStrategy discountStrategy = new NoDiscount();
    private double price;

    public void setPrice(double price) {
        this.price = price;
    }
    public void pay() {
        System.out.println("The price is " + price);
        System.out.println("Current discount is " + discountStrategy);
        System.out.println("The price with discount is " + discountStrategy.applyDiscount(price));
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

}
