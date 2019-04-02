package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer tempDefaultCountingOutRymer = new DefaultCountingOutRhymer();

    public FIFORhymer(IntLinkedList intLinkedList) {
        super(intLinkedList);
    }

    public FIFORhymer() {
        super();
    }


    @Override public int countOut() {
        while (!callCheck())
            tempDefaultCountingOutRymer.countIn(super.countOut());
        int value = tempDefaultCountingOutRymer.countOut();
        while (!tempDefaultCountingOutRymer.callCheck())
            countIn(tempDefaultCountingOutRymer.countOut());
        return value;
    }
}
