package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

    // kombinacje alt <- i alt -> pomagają poruszać się po otwartych kartach

    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
