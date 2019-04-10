package edu.kis.vh.nursery;

import edu.kis.vh.nursery.structures.LinkedListInterface;

public class HanoiRhymer extends DefaultCountingOutRhymer {
    public HanoiRhymer() {
        super();
    }

    public HanoiRhymer(LinkedListInterface intLinkedList) {
        super(intLinkedList);
    }

    private int totalRejected = 0;

    public int reportRejected() {
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
//Skrót alt + strzałka przechodzi do innego pliku w zakładce.
