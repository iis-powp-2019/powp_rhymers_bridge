package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer tempDefaultCountingOutRymer = new DefaultCountingOutRhymer();

    @Override public int countOut() {
        //TODO: potrzeba refoaktoryzacji kodu
        while (!callCheck())
            tempDefaultCountingOutRymer.countIn(super.countOut());
        int value = tempDefaultCountingOutRymer.countOut();
        while (!tempDefaultCountingOutRymer.callCheck())
            countIn(tempDefaultCountingOutRymer.countOut());
        return value;
    }
}
