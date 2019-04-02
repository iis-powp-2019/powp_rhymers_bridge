package edu.kis.vh.nursery;

/**
 * Klasa HanoiRhymer, która dziedziczy z klasy DefaultCountingOutRhymer
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;
    private Stack stack;

    public HanoiRhymer(Stack typeOfImplementation, Stack stack) {
        super(typeOfImplementation);
        this.stack = stack;
    }

    public HanoiRhymer(Stack stack) {
        this.stack = stack;
    }

    public HanoiRhymer() {
    }

    /**
     * Metoda reportuje całkowitą liczbę odrzuconych liczb.
     * @return totalRejected
     */
    int reportRejected() {
        return totalRejected;
    }

    /**
     * Metoda odziedziczona z klasy DefaultCountingOutRhymer
     * @param in - niemutowalny parametr używany w metodzie
     */
    @Override
    public void countIn(final int in) {
        if (!callCheck() && in > actualNumber()) {
            totalRejected++;
        }
        else {
            super.countIn(in);
        }
    }
}
