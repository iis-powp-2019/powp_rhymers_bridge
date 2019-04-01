package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackImpl.IntLinkedList;
import edu.kis.vh.nursery.stackImpl.IntStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

    // Według mnie najlepsza będzie implementacja oparta na liście ponieważ :
    // 1. Może przechowywać nieograniczoną ilość elementów
    // 2. Wstawianie jak i usuwanie z początku listy jest wykonywanie w stałym czasie
    private final IntStack defaultRhymer = new IntLinkedList();
    public FIFORhymer() {
        super();
    }

    @Override
    public int countOut() {
        while (!callCheck())
            defaultRhymer.countIn(super.countOut());

        int retValue = defaultRhymer.countOut();

        while (!defaultRhymer.callCheck())
            countIn(defaultRhymer.countOut());

        return retValue;
    }
}
