package edu.kis.vh.nursery;

import edu.kis.vh.nursery.RhymersStacks.IntLinkedList;
import edu.kis.vh.nursery.RhymersStacks.IntLinkedListInterface;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    public HanoiRhymer() {
    }

    public HanoiRhymer(IntLinkedListInterface intLinkedList) {
        super(intLinkedList);
    }

    public HanoiRhymer(int totalRejected) {
        this.totalRejected = totalRejected;
    }

    public HanoiRhymer(IntLinkedListInterface intLinkedList, int totalRejected) {
        super(intLinkedList);
        this.totalRejected = totalRejected;
    }

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
