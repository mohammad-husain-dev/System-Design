package Pizza.Decorators;

import Pizza.IPizza;

public class CheeseBurst extends PizzaDecorator {

    public CheeseBurst(IPizza pizza) {
        super(pizza);
    }


    @Override
    public String getDescription() {
        return decorated_pizza.getDescription()+" with cheese burst";
    }

    @Override
    public int getCost() {
        return decorated_pizza.getCost()+5;
    }
}
