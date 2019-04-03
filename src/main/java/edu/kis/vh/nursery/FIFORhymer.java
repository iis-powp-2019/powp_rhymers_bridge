package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.Stackable;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temporaryRhymer = new DefaultCountingOutRhymer();

    public FIFORhymer(Stackable stack) {
        super(stack);
    }

    public FIFORhymer() {
    }

    @Override
    public int countOut() {
        while (!callCheck())
            temporaryRhymer.countIn(super.countOut());

        int returningValue = temporaryRhymer.countOut();

        while (!temporaryRhymer.callCheck())
            countIn(temporaryRhymer.countOut());

        return returningValue;
    }
}
