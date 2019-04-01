package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackImpl.IntStack;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public HanoiRhymer() {
        super();
    }

    public HanoiRhymer(IntStack intStack) {
        super(intStack);
    }

    public int reportRejected() {
        return getTotalRejected();
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            setTotalRejected(getTotalRejected() + 1);
        else
            super.countIn(in);
    }

    public int getTotalRejected() {
        return totalRejected;
    }

    public void setTotalRejected(int totalRejected) {
        this.totalRejected = totalRejected;
    }
}

