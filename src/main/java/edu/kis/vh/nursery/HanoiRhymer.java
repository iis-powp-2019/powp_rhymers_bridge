package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntStorageInterface;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public HanoiRhymer(int totalRejected) {
        this.totalRejected = totalRejected;
    }

    public HanoiRhymer(IntStorageInterface intStorageInterface, int totalRejected) {
        super(intStorageInterface);
        this.totalRejected = totalRejected;
    }

    private int reportRejected() {

        return getTotalRejected();
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            setTotalRejected(getTotalRejected() + 1);
        else
            super.countIn(in);
    }

    private int getTotalRejected() {
        return totalRejected;
    }

    private void setTotalRejected(int totalRejected) {
        this.totalRejected = totalRejected;
    }
}
