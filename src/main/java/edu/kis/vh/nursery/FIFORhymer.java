package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private DefaultCountingOutRhymer defaultRhymer = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            defaultRhymer.countIn(super.countOut());

        int retValue = defaultRhymer.countOut();

        while (!defaultRhymer.callCheck())
            countIn(defaultRhymer.countOut());

        return retValue;
    }
}
