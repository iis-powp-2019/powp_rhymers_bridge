package edu.kis.vh.nursery;

/**
 * searching rhymer using Hanoi sequence
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    protected int reportRejected() {
        return getTotalRejected();
    }

    @Override
    protected void countIn(int in) {
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
