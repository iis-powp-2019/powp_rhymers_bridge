package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public HanoiRhymer(IntLinkedList intLinkedList, int totalRejected) {
        super(intLinkedList);
        this.totalRejected = totalRejected;
    }

    public HanoiRhymer(int totalRejected) {
        this.totalRejected = totalRejected;
    }

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void push(int in) {
        if (!isEmpty() && in > top())
            totalRejected++;
        else
            super.push(in);
    }
}
