package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private static final int INITIAL_REJECTED_VALUE = 0;
    private int totalRejected = getInitialRejectedValue();

    public static int getInitialRejectedValue() {
        return INITIAL_REJECTED_VALUE;
    }

    int reportRejected() {
        return getTotalRejected();
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
    //    ALT + strzałka pozwala na przełacznie sie między otwartymi plikami w IDE
}

