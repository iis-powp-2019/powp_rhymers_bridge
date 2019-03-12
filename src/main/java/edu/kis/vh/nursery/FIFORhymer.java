package edu.kis.vh.nursery;

/**
 *  class of specified fifo queue. Pop node from queue
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer defaultCountingOutRhymer = new DefaultCountingOutRhymer();

    /**
     *
     * @return  last value in fifo
     */
    @Override
    public int countOut() {

        while (!callCheck()){
            defaultCountingOutRhymer.countIn(super.countOut());
        }

        int outValue = defaultCountingOutRhymer.countOut();

        while (!defaultCountingOutRhymer.callCheck()){
            countIn(defaultCountingOutRhymer.countOut());
        }

        return outValue;
    }
}
