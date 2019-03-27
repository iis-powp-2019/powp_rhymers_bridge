package edu.kis.vh.nursery;

import edu.kis.vh.nursery.data.DataProvider;

/**
 * searching rhymer using Hanoi sequence
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public HanoiRhymer(){

    }

    public HanoiRhymer(DataProvider list) {
        super(list);
    }

    //push element
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            setTotalRejected(getTotalRejected() + 1);
        else
            super.countIn(in);
    }

    protected int reportRejected() {
        return getTotalRejected();
    }

    public int getTotalRejected() {
        return totalRejected;
    }

    public void setTotalRejected(final int totalRejected) {
        this.totalRejected = totalRejected;
    }
}
