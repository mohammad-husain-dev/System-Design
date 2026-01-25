public class FiveHundredHandler extends MoneyHandler{
    private int avaialbleNoteCount;

    FiveHundredHandler(int count) {
        super();
        System.out.println("FiveHundredHandler constructor");
        this.avaialbleNoteCount = count;
    }
    @Override
    int dispense(int amount) {
        int count = amount/500;
        int rem = amount%500;
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
