public class ATM {
    MoneyHandler thousandHandler;
    MoneyHandler fiveHundredHandler;
    MoneyHandler hundredHandler;

    ATM(){
        System.out.println("This is the ATM object");
        thousandHandler = new ThousandHandler(4);
        fiveHundredHandler = new FiveHundredHandler(2);
        hundredHandler = new HundredHandler(1);

        thousandHandler.nextHandler =  fiveHundredHandler;
        fiveHundredHandler.nextHandler =  hundredHandler;
    }

    public void dispense(int amount){
        System.out.println("This is the ATM dispense");
        if(thousandHandler != null)
            thousandHandler.dispense(amount);
    }
}
