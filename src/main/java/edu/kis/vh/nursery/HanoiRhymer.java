package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.IntCollection;
import edu.kis.vh.nursery.collections.IntLinkedList;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public HanoiRhymer(){

    }

    public HanoiRhymer(IntCollection stack) {
        super(stack);
    }

    public HanoiRhymer(IntCollection stack, int totalRejected) {
        super(stack);
        this.totalRejected = totalRejected;
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
