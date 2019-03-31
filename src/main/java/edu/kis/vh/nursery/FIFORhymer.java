package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.IntArrayStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

    public FIFORhymer() {
        super();
    }

    public FIFORhymer(Collections intLinkedList) {
        super(intLinkedList);
    }

    private Collections temp = new IntArrayStack();

    @Override
    public int countOut() {
        while (!callCheck()) {
            temp.countIn(super.countOut());
        }

        int ret = temp.countOut();

        while (!temp.callCheck()) {
            countIn(temp.countOut());
        }

        return ret;
    }
}
