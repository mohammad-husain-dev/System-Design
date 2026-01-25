public class ThousandHandler extends MoneyHandler{
    private int avaialbleNoteCount;

    ThousandHandler(int count) {
        super();
        System.out.println("ThousandHandler constructor");
        this.avaialbleNoteCount = count;
    }
    @Override
    int dispense(int amount) {
        System.out.println("ThousandHandler dispense");
        int count = amount/1000;
        int rem = amount%1000;
        this.avaialbleNoteCount -= count;
        System.out.println("Dispensing "+count+" Thousand Notes");
        if(nextHandler==null){
            if(rem != 0)
                System.out.println("can not dispense "+rem);
            return count;
        }
        if(rem != 0)
            count += nextHandler.dispense(rem);

        return count;
    }

    public void setNoteCount(int noteCount){
        this.avaialbleNoteCount = noteCount;
    }

    public int getNoteCount(){
        return this.avaialbleNoteCount;
    }
}
