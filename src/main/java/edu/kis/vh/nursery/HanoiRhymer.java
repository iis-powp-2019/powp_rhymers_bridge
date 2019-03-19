package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    public static final int INITIAL_REJECTED_VALUE = 0;
    int totalRejected = INITIAL_REJECTED_VALUE;

    public int reportRejected() {
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

