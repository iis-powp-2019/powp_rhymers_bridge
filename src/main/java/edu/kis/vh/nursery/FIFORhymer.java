package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.Collections;
import edu.kis.vh.nursery.stack.IntArrayStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

    public FIFORhymer() {
        super();
        // TODO Auto-generated constructor stub
    }

    public FIFORhymer(Collections intLinkedList) {
        super(intLinkedList);
        // TODO Auto-generated constructor stub
    }

    public IntArrayStack temp = new IntArrayStack();

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
