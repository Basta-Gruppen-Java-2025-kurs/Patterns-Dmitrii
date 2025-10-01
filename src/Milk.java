public class Milk extends CoffeeDecorator {
    Milk(double cost, String description, Coffee decoratee) {
        super(cost, description, decoratee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " milk";
    }
}
