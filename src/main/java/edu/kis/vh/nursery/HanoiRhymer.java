package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    /**
     * Ilość odrzuconych liczb
     */
    private int totalRejected = 0;

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            this.countIn(in);
    }

    public int getTotalRejected() {
        return totalRejected;
    }

    //    Kombinacja "alt" + "->" lub "alt" + "<-" przełącza podgląd otwertych plików w IDE.
}
