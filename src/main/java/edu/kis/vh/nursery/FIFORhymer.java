package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private DefaultCountingOutRhymer defaultCountingOutRhymer = new DefaultCountingOutRhymer();

    @Override public int countOut() {
        while (!isEmpty())

            defaultCountingOutRhymer.countIn(super.countOut());

        int returningValue = defaultCountingOutRhymer.countOut();

        while (!defaultCountingOutRhymer.isEmpty()){
            countIn(defaultCountingOutRhymer.countOut());
        }

        return returningValue;
    }
}
