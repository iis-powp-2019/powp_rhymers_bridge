package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private static final int NUMBER_OF_REJECTED_RHYMES = 0;

    int totalRejected = NUMBER_OF_REJECTED_RHYMES;

    private int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
