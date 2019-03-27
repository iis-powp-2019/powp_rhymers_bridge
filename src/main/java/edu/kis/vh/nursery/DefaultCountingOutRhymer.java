package edu.kis.vh.nursery;

/**
 * DefaultCountingOutRhymer is class, which is base implementation for rhymers.
 *
 * It can count in numbers up to pre-defined value, and count them out in stack-similiar way.
 */
public class DefaultCountingOutRhymer {
    private IntArrayStack intArrayStack;

    public DefaultCountingOutRhymer() {
        this(new IntArrayStack());
    }

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
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
