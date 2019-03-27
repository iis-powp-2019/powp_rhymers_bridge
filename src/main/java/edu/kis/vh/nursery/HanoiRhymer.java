package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    int getReportRejected() {
        return totalRejected;
    }
    @Override
    public void countIn(int in) {
        if (!isFull() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
// 3.1.3 kombinacje klawiszy alt + (strzałka w lewo) oraz alt + (strzałka w
// prawo ) przemieszcza nas po ostatnio otwartych kartach