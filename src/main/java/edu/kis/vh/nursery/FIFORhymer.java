package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntLinkedList;
import edu.kis.vh.nursery.storage.IntStorageInterface;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final IntLinkedList TEMP = new IntLinkedList();

    public FIFORhymer() {
    }

    public FIFORhymer(IntStorageInterface intStorageInterface) {
        super(intStorageInterface);
    }

    @Override public int countOut() {
        while (!callCheck())
            getTemp().push(super.countOut());


        int ret = TEMP.pop();

        while (!getTemp().isEmpty())
            countIn(getTemp().pop());

        return ret;
    }

    private IntLinkedList getTemp() {
        return TEMP;
    }
}
