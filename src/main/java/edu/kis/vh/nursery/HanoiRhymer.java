package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.IntLinkedList;

/**
 * Klasa HanoiRhymer dziedziczy z klasy DefaultCountingOutRhymer
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public HanoiRhymer(IntLinkedList intLinkedList) {
        super(intLinkedList);
    }

    public HanoiRhymer() {
        super();
    }

    /**
     * Metoda zwraca liczbę odrzuconych liczb.
     *
     * @return totalRejected
     */
    int reportRejected() {
        return totalRejected;
    }

    /**
     * Nadpisana metoda z klasy DefaultCountingOutRhymer
     *
     * @param in - parametr wejsciowy
     */

    @Override
    public void countIn(final int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
