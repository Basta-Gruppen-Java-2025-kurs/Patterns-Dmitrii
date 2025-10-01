public class Sugar extends CoffeeDecorator{
    Sugar(double cost, String description, Coffee decoratee) {
        super(cost, description, decoratee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " sugar";
    }
}
