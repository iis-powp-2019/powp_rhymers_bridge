package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stacks.IntArrayStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private StackInterface temp = new IntArrayStack();


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
