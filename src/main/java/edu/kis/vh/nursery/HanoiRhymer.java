package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackable.IntArrayStack;
import edu.kis.vh.nursery.stackable.IntLinkedList;

public final class HanoiRhymer extends DefaultCountingOutRhymer {

    private static final int ZERO = 0;
    private int totalRejected = ZERO;

    public HanoiRhymer(IntArrayStack intArrayStack) {
        super(intArrayStack);
    }

    public HanoiRhymer(IntLinkedList intLinkedList) {
        super(intLinkedList);
    }

    public HanoiRhymer() {
    }

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
