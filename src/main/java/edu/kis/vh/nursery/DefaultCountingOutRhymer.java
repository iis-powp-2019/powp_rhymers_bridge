package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private IntArrayStack intArrayStack;

    public DefaultCountingOutRhymer(IntArrayStack stack) {
        this.intArrayStack = stack;
    }

    public DefaultCountingOutRhymer() {
        intArrayStack = new IntArrayStack();
    }

    public void countIn(int in) {
        intArrayStack.countIn(in);
    }

    boolean callCheck() {
        return intArrayStack.callCheck();
    }

    boolean isFull() {
        return intArrayStack.isFull();
    }

    int peekaboo() {
        return intArrayStack.peekaboo();
    }

    public int countOut() {
        return intArrayStack.countOut();
    }
}
