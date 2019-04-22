package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackBulider.IntArrayStack;
import edu.kis.vh.nursery.stackBulider.IntLinkedList;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private static final int NUMBER_ZERO = 0;
    private int totalRejected = NUMBER_ZERO;

    public HanoiRhymer(IntLinkedList intLinkedList) {
    }

    public HanoiRhymer(IntArrayStack intArrayStack) {
    }

    public  int reportRejected() {
        return getTotalRejected();
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            setTotalRejected(getTotalRejected() + 1);
        else
            super.countIn(in);
    }

    public int getTotalRejected() {
        return totalRejected;
    }

    public HanoiRhymer(IntLinkedList intLinkedList, int totalRejected) {
        super(intLinkedList);
        this.totalRejected = totalRejected;
    }
    public HanoiRhymer(){}

    public void setTotalRejected(int totalRejected) {
        this.totalRejected = totalRejected;
    }
}
