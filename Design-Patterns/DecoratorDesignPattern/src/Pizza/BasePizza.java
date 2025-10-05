package Pizza;

public class BasePizza implements IPizza {
    @Override
    public String getDescription() {
        return "Base pizza";
    }

    @Override
    public int getCost() {
        return 50;
    }
}
