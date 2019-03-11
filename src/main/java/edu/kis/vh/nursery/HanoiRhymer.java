package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private static final int ZERO = 0;
    int totalRejected = ZERO;

    protected int reportRejected() {
        return totalRejected;
    }

    protected void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
