public class HundredHandler extends MoneyHandler{
    private int avaialbleNoteCount;

    HundredHandler(int count) {
        super();
        System.out.println("HundredHandler constructor");
        this.avaialbleNoteCount = count;
    }
    @Override
    int dispense(int amount) {
        int count = amount/100;
        int rem = amount%100;
        this.avaialbleNoteCount -= count;
        System.out.println("Dispensing "+count+" Hundred Notes");
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
