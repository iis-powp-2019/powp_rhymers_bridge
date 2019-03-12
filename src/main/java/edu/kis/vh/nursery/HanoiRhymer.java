package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    int reportRejected() {
        return totalRejected;
    }

    @Override
    void countIn(final int in) {
        if (!callCheck() && in > peekaboo()) //źle sformatowana
            totalRejected++;
        else //źle sformatowana
            super.countIn(in); //źle sformatowana
    }
}

//klawisze alt + strzałki umożliwiają przemieszczanie się między plikami(kartami), na których operujemy