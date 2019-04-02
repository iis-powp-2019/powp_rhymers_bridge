package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.IntArrayStack;
import edu.kis.vh.nursery.collection.Stackable;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final IntArrayStack TEMP = new IntArrayStack();

    public FIFORhymer(Stackable stackable) {
        super(stackable);
    }

    public FIFORhymer() {
        super();
    }

    @Override public int countOut() {
        while (!callCheck())
            TEMP.push(super.countOut());
        int value = TEMP.pop();
        while (!TEMP.isEmpty())
            countIn(TEMP.pop());
        return value;
    }
}
