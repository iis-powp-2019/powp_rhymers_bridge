package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntegerLinkedList;
import edu.kis.vh.nursery.stack.Stackable;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final Stackable temporaryRhymer = new IntegerLinkedList();

    public FIFORhymer(Stackable stack) {
        super(stack);
    }

    public FIFORhymer() {
    }

    @Override
    public int countOut() {
        while (!callCheck())
            temporaryRhymer.push(super.countOut());

        int returningValue = temporaryRhymer.pop();

        while (!temporaryRhymer.isEmpty())
            countIn(temporaryRhymer.pop());

        return returningValue;
    }
}
