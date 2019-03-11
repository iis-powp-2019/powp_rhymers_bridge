package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private static final int ZERO = 0;
    private int totalRejected = ZERO;

    protected int reportRejected() {
        return getTotalRejected();
    }

    protected void countIn(final int in) {
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
