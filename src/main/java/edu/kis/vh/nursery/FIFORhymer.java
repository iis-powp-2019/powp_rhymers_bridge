package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    public FIFORhymer(IntLinkedList intStackInterface) {
        super(intStackInterface);
    }

    public FIFORhymer() {
    }

    @Override
    public int countOut() {

        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
