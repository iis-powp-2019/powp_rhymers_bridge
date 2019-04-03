package edu.kis.vh.nursery;

import edu.kis.vh.nursery.dataStructures.IntArrayStack;
import edu.kis.vh.nursery.dataStructures.IntLinkedList;

/**
 * Klasa dziedzicząca z klasy DefaultCountingOutRhymer
 */

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private static final int INITIAL_REJECTED_VALUE = 0;
    private int totalRejected = INITIAL_REJECTED_VALUE;

    private IStackAndListSimilarities Stack;

    public HanoiRhymer(IntArrayStack intArrayStack) {
        this.Stack = intArrayStack;
    }

    public HanoiRhymer() {

    }

    public HanoiRhymer(IntLinkedList intLinkedList) {
        this.Stack = intLinkedList;
    }

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

