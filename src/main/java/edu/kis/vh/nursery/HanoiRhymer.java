package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.Stackable;

/**
 * Class representing stack in which value can't be put if that value is higher than the current top of the stack
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public HanoiRhymer(Stackable stack) {
        super(stack);
    }

    public HanoiRhymer() {
    }

    /**
     * @return amount of rejected numbers
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * @param input value to be added to rhymer
     */
    @Override
    public void countIn(final int input) {
        if (!callCheck() && input > peekaboo())
            totalRejected++;
        else
            super.countIn(input);
    }
}
