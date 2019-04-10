package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntStorageInterface;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    protected int reportRejected() {
        return getTotalRejected();
    }

    public HanoiRhymer(int totalRejected) {
        this.totalRejected = totalRejected;
    }

    public HanoiRhymer(IntStorageInterface intStorageInterface, int totalRejected) {
        super(intStorageInterface);
        this.totalRejected = totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            setTotalRejected(getTotalRejected() + 1);
        else
            super.countIn(in);
    }

    public int getTotalRejected() {
        return totalRejected;
    }

    public void setTotalRejected(int totalRejected) {
        this.totalRejected = totalRejected;
    }
}
//    kombinacje alt + <- i alt + -> sluza do szybkiego przelaczania miedzy otwartymi plikami
