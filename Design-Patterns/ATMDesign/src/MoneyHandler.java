public abstract class MoneyHandler {
    MoneyHandler nextHandler;

    void setNextHandler(MoneyHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    abstract int dispense(int amount);
}
