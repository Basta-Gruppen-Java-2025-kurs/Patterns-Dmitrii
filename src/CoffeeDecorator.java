public abstract class CoffeeDecorator implements Coffee {
    public static final String WITH = " with ", AND = " and ";
    protected double cost;
    protected String description;
    protected Coffee decoratee;

    CoffeeDecorator(double cost, String description, Coffee decoratee){
        this.cost = cost;
        this.description = description;
        this.decoratee = decoratee;
    }

    @Override
    public double getCost() {
        return this.cost + decoratee.getCost();
    }

    @Override
    public String getDescription() {
        StringBuilder decorateeDescription = new StringBuilder(decoratee.getDescription());
        if (decorateeDescription.indexOf(WITH) < 0) {
            decorateeDescription.append(WITH);
        } else {
            int ix = decorateeDescription.indexOf(AND);
            if (ix > -1) {
                decorateeDescription.replace(ix, ix+5, ", ");
            }
            decorateeDescription.append(AND);
        }
        decorateeDescription.append(description);
        return decorateeDescription.toString();
    }
}
