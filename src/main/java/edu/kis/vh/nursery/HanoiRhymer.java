package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.Collections;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalOfRejected = 0;

    public int reportOfRejected() {
        return totalOfRejected;
    }

    public HanoiRhymer(){super();}

    public HanoiRhymer(Collections collections){
        super(collections);
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalOfRejected++;
        else
            super.countIn(in);
    }
}
