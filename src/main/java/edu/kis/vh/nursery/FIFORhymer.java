package edu.kis.vh.nursery;

import edu.kis.vh.nursery.RhymersStacks.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    public FIFORhymer() {
    }

    public FIFORhymer(IntLinkedList intLinkedList) {
        super(intLinkedList);
    }

    /**
     * Obsługa kolejki FIFO
     *
     * @return wartość elementu kolejki FIFO
     */

    @Override
    public int countOut() {
        while (!callCheck())
            this.countIn(this.countOut());

        int ret = this.countOut();

        while (!this.callCheck())
            countIn(this.countOut());

        return ret;
    }


}
