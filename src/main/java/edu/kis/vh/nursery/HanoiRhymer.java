package edu.kis.vh.nursery;

import edu.kis.vh.nursery.containers.Stack;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public HanoiRhymer(int totalRejected) {
        this.totalRejected = totalRejected;
    }

    public HanoiRhymer(Stack intLinkedList, int totalRejected) {
        super(intLinkedList);
        this.totalRejected = totalRejected;
    }

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!isCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
    //skrót klawiszowy alt+strzałka pozwala nam na zmienianie otwartych kart w IntelliJ IDEA
}
