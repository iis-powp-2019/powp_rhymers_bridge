package edu.kis.vh.nursery;

/**
 * searching rhymer using Hanoi sequence
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    protected int reportRejected() {
        return getTotalRejected();
    }

    //push element
    @Override public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            setTotalRejected(getTotalRejected() + 1);
        else
            super.countIn(in);
    }

    @Override public void push(int i) {
        if (!isEmpty() && i > top())
            setTotalRejected(getTotalRejected() + 1);
        else
            super.push(i);
    }

    public int getTotalRejected() {
        return totalRejected;
    }

    public void setTotalRejected(final int totalRejected) {
        this.totalRejected = totalRejected;
    }
}
