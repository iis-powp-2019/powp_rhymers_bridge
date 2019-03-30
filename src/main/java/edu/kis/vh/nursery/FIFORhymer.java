package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntArrayStack;
import edu.kis.vh.nursery.storage.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final IntArrayStack TEMP = new IntArrayStack();

    public FIFORhymer(){
        super();

    }

    public FIFORhymer(IntLinkedList stackableInterface){
        super(stackableInterface);
    }

    @Override public int countOut() {
        while (!callCheck())
            getTemp().push(super.countOut());

        int ret = getTemp().pop();

        while (!getTemp().isEmpty())
            countIn(getTemp().pop());

        return ret;
    }

    public IntArrayStack getTemp() {
        return TEMP;
    }
}
