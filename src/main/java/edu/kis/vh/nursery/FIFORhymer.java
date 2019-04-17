package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackable.IntArrayStack;
import edu.kis.vh.nursery.stackable.IntLinkedList;

public final class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    public FIFORhymer(IntArrayStack intArrayStack) {
        super(intArrayStack);
    }

    public FIFORhymer(IntLinkedList intLinkedList) {
        super(intLinkedList);
    }

    public FIFORhymer() {
    }

    @Override
    public int countOut() {
        while (!callCheck())

            temp.countIn(super.countOut());

        final int ret = temp.countOut();

        while (!temp.callCheck())

            countIn(temp.countOut());

        return ret;
    }
}
