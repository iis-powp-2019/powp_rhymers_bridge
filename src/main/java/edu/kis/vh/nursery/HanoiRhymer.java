package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalOfRejected = 0;

    public int reportOfRejected() {
        return totalOfRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalOfRejected++;
        else
            super.countIn(in);
    }
}
