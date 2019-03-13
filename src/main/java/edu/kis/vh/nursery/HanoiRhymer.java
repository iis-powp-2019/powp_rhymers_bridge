package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private static final int STARTING_TOTAL = 0;
    private int totalRejected = STARTING_TOTAL;

    int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}

// skróty alt + strzałki lewo/prawo odpowiada za przełączanie się pomiędzy kartami aktualnie otawrtych plików
