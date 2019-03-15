package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private DefaultCountingOutRhymer tempDefaultCountingOutRhymer = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            getTempDefaultCountingOutRhymer().countIn(super.countOut());

        int returnDefaultCountingOutRhymerCount = getTempDefaultCountingOutRhymer().countOut();

        while (!getTempDefaultCountingOutRhymer().callCheck())
            countIn(getTempDefaultCountingOutRhymer().countOut());

        return returnDefaultCountingOutRhymerCount;
    }

    public DefaultCountingOutRhymer getTempDefaultCountingOutRhymer() {
        return tempDefaultCountingOutRhymer;
    }

}
