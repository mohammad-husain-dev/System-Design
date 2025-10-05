package Pizza.Decorators;

import Pizza.IPizza;

public class ExtraChicken extends PizzaDecorator {
    public ExtraChicken(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decorated_pizza.getDescription()+" with ExtraChicken";
    }

    @Override
    public int getCost() {
        return decorated_pizza.getCost()+10;
    }
}
