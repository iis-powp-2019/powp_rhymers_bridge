package edu.kis.vh.nursery;

/**
 * DefaultCountingOutRhymer is counting-out rhyme used to conducting complicated number games
 */
public class DefaultCountingOutRhymer {
    private IntArrayStack intArrayStack;

    public DefaultCountingOutRhymer() {
        this.intArrayStack = new IntArrayStack();
    }

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public int getSTACK_EMPTY_INDICATOR() {
        return intArrayStack.getSTACK_EMPTY_INDICATOR();
    }

    public void countIn(int in) {
        intArrayStack.countIn(in);
    }

    public boolean callCheck() {
        return intArrayStack.callCheck();
    }

    public boolean isFull() {
        return intArrayStack.isFull();
    }

    public int peekaboo() {
        return intArrayStack.peekaboo();
    }

    public int countOut() {
        return intArrayStack.countOut();
    }
}
