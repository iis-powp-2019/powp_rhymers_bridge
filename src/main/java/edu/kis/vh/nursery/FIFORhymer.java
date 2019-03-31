package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.datastructures.IntArrayStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final Stack temp = new IntArrayStack();

    public FIFORhymer() {
        super();
        // TODO Auto-generated constructor stub
    }

    public FIFORhymer(Stack stack) {
        super(stack);
        // TODO Auto-generated constructor stub
    }

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
