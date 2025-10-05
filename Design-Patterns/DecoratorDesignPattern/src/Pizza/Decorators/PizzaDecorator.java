package Pizza.Decorators;

import Pizza.IPizza;

public abstract class PizzaDecorator implements IPizza {
    IPizza decorated_pizza;
    public PizzaDecorator(IPizza pizza) {
        this.decorated_pizza=pizza;
    }
}
