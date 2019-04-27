package edu.kis.vh.nursery;

import edu.kis.vh.nursery.RhymersStacks.IntLinkedList;
import edu.kis.vh.nursery.RhymersStacks.IntLinkedListInterface;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private IntLinkedList temp = new IntLinkedList();

    public FIFORhymer() {
    }

    public FIFORhymer(IntLinkedListInterface intLinkedList) {
        super(intLinkedList);
    }

    /**
     * Obsługa kolejki FIFO
     *
     * @return wartość elementu kolejki FIFO
     */

    @Override
    public int countOut() {
        while (!callCheck())
            temp.push(super.countOut());

        int ret = temp.pop();

        while (!temp.isEmpty())
            countIn(temp.pop());

        return ret;
    }


}
