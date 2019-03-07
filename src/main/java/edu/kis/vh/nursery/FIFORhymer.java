package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    public DefaultCountingOutRhymer defaultCountingOutRhymer = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            defaultCountingOutRhymer.countIn(super.countOut());

        int ret = defaultCountingOutRhymer.countOut();

        while (!defaultCountingOutRhymer.callCheck())
            countIn(defaultCountingOutRhymer.countOut());

        return ret;
    }


}
