package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public HanoiRhymer(IntLinkedList intLinkedList) {
        super(intLinkedList);
    }

    public HanoiRhymer() {
    }

    protected int reportRejected() {
        return getTotalRejected();
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            setTotalRejected(getTotalRejected() + 1);
        else
            super.countIn(in);
    }

    private int getTotalRejected() {
        return totalRejected;
    }

    private void setTotalRejected(int totalRejected) {
        this.totalRejected = totalRejected;
    }
}
