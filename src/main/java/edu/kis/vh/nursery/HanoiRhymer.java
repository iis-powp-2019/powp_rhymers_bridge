package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackImplementation.IntLinkedList;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public HanoiRhymer(IntLinkedList list) {
        super(list);
    }

    public HanoiRhymer() {
    }

    protected int reportRejected() {
        return totalRejected;
    }

    @Override public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
//przelaczanie pomiedzy otwartymi plikami
