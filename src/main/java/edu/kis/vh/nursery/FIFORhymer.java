package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final Stackable temp = new IntLinkedList();

    public FIFORhymer(Stackable stackable) {
        super(stackable);
    }

    public FIFORhymer() {
        super();
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
