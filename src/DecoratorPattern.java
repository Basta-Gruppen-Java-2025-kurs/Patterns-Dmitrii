import java.util.ArrayList;

public class DecoratorPattern {
    public static void coffee(Logger logger) {
        Coffee kegCoffee = new SimpleCoffee(25, "brewed coffee");
        CoffeeDecorator order1 = new Milk(5, "regular", kegCoffee);
        CoffeeDecorator order2 = new Sugar(5, "brown", order1);
        CoffeeDecorator order3 = new WhippedCream(10, "vanilla", order2);
        ArrayList<Coffee> orders = new ArrayList<>();
        orders.add(kegCoffee);
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        for (Coffee order : orders) {
            logger.log(order.getDescription() + " - " + order.getCost() + " SEK");
        }

    }
}
