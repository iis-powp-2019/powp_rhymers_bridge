package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntStackInterface;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    int totalRejected = 0;

    public HanoiRhymer(IntStackInterface intStackInterface) {
        super(intStackInterface);
    }

    public HanoiRhymer() {
    }

    int reportRejected() {
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
