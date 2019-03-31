package edu.kis.vh.nursery;

import edu.kis.vh.nursery.data_structure.DataStructure;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    // kombinacje alt <- i alt -> pomagają poruszać się po otwartych kartach

    private int totalRejected = 0;

    public HanoiRhymer() {
        super();
    }

    public HanoiRhymer(DataStructure dataStructure) {
        super(dataStructure);
    }

    public int reportRejected() {
        return totalRejected;
    }

    @Override public void countIn(final int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
