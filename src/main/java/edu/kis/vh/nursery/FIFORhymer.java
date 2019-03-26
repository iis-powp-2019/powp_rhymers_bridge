package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntArrayStack;
import edu.kis.vh.nursery.storage.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final IntLinkedList TEMP = new IntLinkedList();

    public FIFORhymer() {
        super();
    }

    public FIFORhymer(IntLinkedList intStorageInterface) {
        super(intStorageInterface);
    }

    @Override
    public int countOut() {

        while (!callCheck())
            TEMP.push(super.countOut());

        int ret = TEMP.pop();

        while (!TEMP.isEmpty())
            countIn(TEMP.pop());

        return ret;
    }

    public IntLinkedList getTemp() {
        return TEMP;
    }
}
