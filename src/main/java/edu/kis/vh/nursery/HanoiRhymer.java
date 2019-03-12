package edu.kis.vh.nursery;


public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(final int IN) {

        if (!callCheck() && IN > peekaboo())
            totalRejected++;
        else
            super.countIn(IN);
    }
}
