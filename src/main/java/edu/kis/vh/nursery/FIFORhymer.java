package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

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
