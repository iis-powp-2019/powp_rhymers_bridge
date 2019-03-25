package edu.kis.vh.nursery;

import edu.kis.vh.nursery.OwnStackImplementation.IntLinkedList;

/**
 *  class of specified fifo queue. Pop node from queue
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    public FIFORhymer(IntStack intStack) {
        super(intStack);
    }

    public FIFORhymer() {
    }

    // implementacja z linkedList pozwala na nieograniczaną liczbą elementów, a
    // w przypadku FIFO (first in first out ) pobierany jest pierwszy elemnt z listy, więc szukanie w LinkedList jest stałę.
    private final IntLinkedList tmp = new IntLinkedList();

    /**
     *
     * @return  last value in fifo
     */
    @Override
    public int countOut() {

        while (!callCheck()){
            tmp.countIn(super.countOut());
        }

        int outValue = tmp.countOut();

        while (!tmp.callCheck()){
            countIn(tmp.countOut());
        }

        return outValue;
    }
}
