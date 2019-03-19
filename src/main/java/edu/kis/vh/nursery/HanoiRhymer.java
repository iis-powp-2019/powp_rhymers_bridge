package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!isCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
    //skrót klawiszowy alt+strzałka pozwala nam na zmienianie otwartych kart w IntelliJ IDEA
}
