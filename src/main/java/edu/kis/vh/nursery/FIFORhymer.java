package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private DefaultCountingOutRhymer defaultCountingOutRhymer = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {

        while (!callCheck()){
            defaultCountingOutRhymer.countIn(super.countOut());
        }

        int outValue = defaultCountingOutRhymer.countOut();

        while (!defaultCountingOutRhymer.callCheck()){
            countIn(defaultCountingOutRhymer.countOut());
        }

        return outValue;
    }
}
