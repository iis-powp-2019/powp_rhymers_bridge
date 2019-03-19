package edu.kis.vh.nursery;

/**
 * Klasa dziedzicząca z klasy DefaultCountingOutRhymer
 */

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private static final int INITIAL_REJECTED_VALUE = 0;
    private int totalRejected = INITIAL_REJECTED_VALUE;



    /**
     * Zwraca całkowitą liczbę odrzuconych liczb
     *
     * @return totalRejected
     */
    int reportRejected() {
        return getTotalRejected();
    }

    /**
     * Metoda odzedziczona z DefaultCountingOutRhymer
     *
     * @param in - liczba zgłaszana do wylicznki
     */
    @Override public void countIn(int in) {
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

