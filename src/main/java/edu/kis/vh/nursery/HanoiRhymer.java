package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackImplementation.StackInterface;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public HanoiRhymer() { super(); }

    public HanoiRhymer(StackInterface stackInterface) {
        super(stackInterface);
    }

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(final int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
