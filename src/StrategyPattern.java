public class StrategyPattern {
    public static void shop() {
        try {
            FixedDiscount fixedDiscount1 = new FixedDiscount(10.0);
            FixedDiscount fixedDiscount2 = new FixedDiscount(150.0);
            PercentageDiscount percentageDiscount1 = new PercentageDiscount(0.25);
            PercentageDiscount percentageDiscount2 = new PercentageDiscount(0.15);

            Cart cart = new Cart();
            cart.setPrice(1000);
            cart.pay();
            cart.setDiscountStrategy(fixedDiscount1);
            cart.pay();
            cart.setDiscountStrategy(fixedDiscount2);
            cart.setPrice(400);
            cart.pay();
            cart.setDiscountStrategy(percentageDiscount1);
            cart.setPrice(500);
            cart.pay();
            cart.setDiscountStrategy(percentageDiscount2);
            cart.setPrice(3000);
            cart.pay();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
