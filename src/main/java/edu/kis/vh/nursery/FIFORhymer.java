package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    public DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        int ret = temp.countOut();

        while (!callCheck())
            temp.countIn(super.countOut());

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
