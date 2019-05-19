package edu.kis.vh.nursery;


import edu.kis.vh.nursery.collection.IntCollection;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public HanoiRhymer() {
    }

    public HanoiRhymer(IntCollection stack) {
        super(stack);
    }

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
