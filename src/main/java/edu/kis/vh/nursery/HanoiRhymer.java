package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.Collections;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    public HanoiRhymer() {
        super();
        // TODO Auto-generated constructor stub
    }

    public HanoiRhymer(Collections intLinkedList) {
        super(intLinkedList);
        // TODO Auto-generated constructor stub
    }

    private int totalRejected = 0;

    protected int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo()) {
            totalRejected++;
        } else {
            super.countIn(in);
        }
    }

    private int getTotalRejected() {
        return totalRejected;
    }

    private void setTotalRejected(int totalRejected) {
        this.totalRejected = totalRejected;
    }
}
