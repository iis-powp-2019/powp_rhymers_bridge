package edu.kis.vh.nursery;

import edu.kis.vh.nursery.ownStackImplementations.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    // Lepiej użyc listy niż tablicy, FIFO -first in, first out, iteruje od początku, tak samo jak lista
    private final IntLinkedList intLinkedList = new IntLinkedList();
    public FIFORhymer() {
        super();
    }

    public FIFORhymer(IIntStack iIntStack) {
        super(iIntStack);
    }

    @Override
    public int countOut() {
        while (!isFull()) {
            intLinkedList.push(super.countOut());
        }

        int returnDefaultCountingOutRhymerCount = intLinkedList.pop();

        while (!intLinkedList.isFull()) {
            countIn(intLinkedList.pop());
        }

        return returnDefaultCountingOutRhymerCount;
    }


}
