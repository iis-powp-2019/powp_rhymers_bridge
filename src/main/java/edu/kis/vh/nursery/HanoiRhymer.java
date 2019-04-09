package edu.kis.vh.nursery;

import edu.kis.vh.nursery.dataStructures.DataStructure;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public HanoiRhymer(DataStructure dataStructure) {
        super(dataStructure);
    }

    public HanoiRhymer() {
    }

    int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
//    Skrót klawiszowy dla ostatniej lokalizacji edycji to CTRL + SHIFT + Backspace
}
