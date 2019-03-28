package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private IntArrayStack intArrayStack;

    public DefaultCountingOutRhymer() {
        this.intArrayStack = new IntArrayStack();
    }

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
        super();
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

    public int getTotal() {
        return intArrayStack.getTotal();
    }

    public int[] getNumbers() {
        return intArrayStack.getNumbers();
    }
}
