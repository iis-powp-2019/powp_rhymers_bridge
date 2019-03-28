package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stacks.IntLinkedList;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private static final int ZERO = 0;
    private int totalRejected = ZERO;



    protected int reportRejected() {
        return getTotalRejected();
    }

    public HanoiRhymer() {
        super();
    }

    @Override
    public void countIn(final int in) {
        if (!callCheck() && in > peekaboo())
            setTotalRejected(getTotalRejected() + 1);
        else
            super.countIn(in);
    }

    public int getTotalRejected() {
        return totalRejected;
    }
    
    public void setTotalRejected(final int totalRejected) {
        this.totalRejected = totalRejected;
    }
}
