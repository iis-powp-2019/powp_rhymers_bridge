package edu.kis.vh.nursery;

public final class HanoiRhymer extends DefaultCountingOutRhymer {

    private static final int ZERO = 0;
    private int totalRejected = ZERO;

    int reportRejected() {
        return getTotalRejected();
    }

    @Override
    public void countIn(final int in) {
        if (!callCheck() && in > peekaboo())
            setTotalRejected(getTotalRejected() + 1);
        else
            super.countIn(in);
    }

    private int getTotalRejected() {
        return totalRejected;
    }

    private void setTotalRejected(final int totalRejected) {
        this.totalRejected = totalRejected;
    }
}
