package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    public FIFORhymer(IntLinkedList intLinkedList) {
        super(intLinkedList);
    }

    public FIFORhymer() {
    }

    public int countOut() {
        while (!isEmpty())

            temp.push(super.pop());

        int ret = temp.pop();

        while (!temp.isEmpty())

            push(temp.pop());

        return ret;
    }
}
