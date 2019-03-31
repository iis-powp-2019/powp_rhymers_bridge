package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntStackInterface;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    public FIFORhymer(IntStackInterface intStackInterface) {
        super(intStackInterface);
    }

    public FIFORhymer() {
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
