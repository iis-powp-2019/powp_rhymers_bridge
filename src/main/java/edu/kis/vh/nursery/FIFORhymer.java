package edu.kis.vh.nursery;

import edu.kis.vh.nursery.datastructures.IntArrayStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer(new IntArrayStack());

    public FIFORhymer() {
        super();
    }

    public FIFORhymer(Rhymer rhymer) {
        super(rhymer);
    }

    @Override
    public int countOut() {
        while (!callCheck())

            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())

            countIn(temp.countOut());

        return ret;
    }
}
