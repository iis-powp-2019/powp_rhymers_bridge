package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final IntArrayStack temp = new IntArrayStack();

    public FIFORhymer() {
        super();
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
}
