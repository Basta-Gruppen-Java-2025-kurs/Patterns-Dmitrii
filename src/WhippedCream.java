public class WhippedCream extends CoffeeDecorator{
    WhippedCream(double cost, String description, Coffee decoratee) {
        super(cost, description, decoratee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " cream";
    }
}
