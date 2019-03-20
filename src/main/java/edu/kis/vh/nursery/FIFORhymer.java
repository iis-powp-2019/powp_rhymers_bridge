package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    public DefaultCountingOutRhymer tempDefaultCountingOutRymer = new DefaultCountingOutRhymer();

    @Override public int countOut() {
        while (!callCheck())

            tempDefaultCountingOutRymer.countIn(super.countOut());

        int value = tempDefaultCountingOutRymer.countOut();

        while (!tempDefaultCountingOutRymer.callCheck())

            countIn(tempDefaultCountingOutRymer.countOut());

        return value;
    }
}
