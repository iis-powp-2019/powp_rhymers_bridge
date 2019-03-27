package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    IntArrayStack intArrayStack;

    public int getTotal() {
        return intArrayStack.getTotal();
    }

    public void countIn(int IN) {
        intArrayStack.countIn(IN);
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

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public DefaultCountingOutRhymer() {
        intArrayStack = new IntArrayStack();
    }
}
