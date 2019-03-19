package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private static final int INITIAL_REJECTED_VALUE = 0;
    private int totalRejected = INITIAL_REJECTED_VALUE;

    int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
    //    ALT + strzałka pozwala na przełacznie sie między otwartymi plikami w IDE
}

