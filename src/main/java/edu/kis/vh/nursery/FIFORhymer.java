package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.stacks.LinkedListOfIntegers;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private DefaultCountingOutRhymer defaultCountingOutRhymer = new DefaultCountingOutRhymer();

    public FIFORhymer(LinkedListOfIntegers linkedListOfIntegers, DefaultCountingOutRhymer defaultCountingOutRhymer) {
        super(linkedListOfIntegers);
        this.defaultCountingOutRhymer = defaultCountingOutRhymer;
    }

    @Override public int countOut() {
        while (!isEmpty())

            getDefaultCountingOutRhymer().countIn(super.countOut());

        int returningValue = getDefaultCountingOutRhymer().countOut();

        while (!getDefaultCountingOutRhymer().isEmpty()){
            countIn(getDefaultCountingOutRhymer().countOut());
        }

        return returningValue;
    }

    public DefaultCountingOutRhymer getDefaultCountingOutRhymer() {
        return defaultCountingOutRhymer;
    }

}
