package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final IntLinkedList temp = new IntLinkedList();

    public FIFORhymer() {
        super();
    }

    public FIFORhymer(IntLinkedList intLinkedList) {
        super(intLinkedList);
    }

    @Override
    public int countOut() {
        while (!callCheck())

            temp.push(super.countOut());

        int ret = temp.pop();

        while (!temp.isEmpty())

            countIn(temp.pop());

        return ret;
    }

    public IntLinkedList getTemp() {
        return temp;
    }
}
