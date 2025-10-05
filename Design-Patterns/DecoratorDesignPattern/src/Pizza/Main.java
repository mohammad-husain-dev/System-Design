package Pizza;

import Pizza.Decorators.CheeseBurst;
import Pizza.Decorators.ExtraChicken;

public class Main {
    public static void main(String[] args) {
        IPizza pizza=new BasePizza();
        pizza=new CheeseBurst(pizza);
        pizza=new ExtraChicken(pizza);

        System.out.println(pizza.getCost());
    }
}
