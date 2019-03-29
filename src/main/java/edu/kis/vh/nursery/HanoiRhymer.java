package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntStorage;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected;

    int reportRejected() {
        return totalRejected;
    }

    public HanoiRhymer(IntStorage intStorage) {
        super(intStorage);
    }

    public HanoiRhymer(){
        this.totalRejected = 0;
    }

    @Override
    void countIn(final int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}

