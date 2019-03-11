package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    @Override
    int countOut() {
        int ret = temp.countOut();

        while (!callCheck())
            temp.countIn(super.countOut());

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
