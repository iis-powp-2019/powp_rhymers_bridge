package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private DefaultCountingOutRhymer countingOfRhymer = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            countingOfRhymer.countIn(super.countOut());
        int ret = countingOfRhymer.countOut();
        while (!countingOfRhymer.callCheck())
            countIn(countingOfRhymer.countOut());
        return ret;
    }
}
