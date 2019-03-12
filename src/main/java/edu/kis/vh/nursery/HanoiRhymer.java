package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }
    @Override
    public void countIn(int in) {
        if (!intArrayStack.isEmpty() && in > intArrayStack.top())
            totalRejected++;
        else
            super.countIn(in);
    }
}
