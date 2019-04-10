package edu.kis.vh.nursery;

import edu.kis.vh.nursery.structures.LinkedListInterface;

public class FIFORhymer extends DefaultCountingOutRhymer {
    public FIFORhymer() {
        super();
    }

    public FIFORhymer(LinkedListInterface intLinkedList) {
        super(intLinkedList);
    }

    final private DefaultCountingOutRhymer TEMP = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            TEMP.countIn(super.countOut());

        int ret = TEMP.countOut();

        while (!TEMP.callCheck())
            countIn(TEMP.countOut());

        return ret;
    }
}
