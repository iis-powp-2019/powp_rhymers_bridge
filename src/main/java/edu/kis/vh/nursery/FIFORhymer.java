package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer defaultCountingOutRhymer = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!isFull()) {
            defaultCountingOutRhymer.countIn(super.countOut());
        }

        int returnDefaultCountingOutRhymerCount = defaultCountingOutRhymer.countOut();

        while (!defaultCountingOutRhymer.isFull()) {
            countIn(defaultCountingOutRhymer.countOut());
        }

        return returnDefaultCountingOutRhymerCount;
    }


}
