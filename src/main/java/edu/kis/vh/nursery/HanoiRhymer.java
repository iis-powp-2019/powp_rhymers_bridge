package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private static final int NUMBER_ZERO = 0;
    private int totalRejected = NUMBER_ZERO;

    protected  int reportRejected() {
        return totalRejected;
    }

    protected void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
//5,12,14,15