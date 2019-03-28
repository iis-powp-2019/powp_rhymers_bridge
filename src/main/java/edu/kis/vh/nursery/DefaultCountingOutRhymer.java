package edu.kis.vh.nursery;

/**
 * @author Maciek Implementing a stack of integers with pointer on last added element.
 */
public class DefaultCountingOutRhymer {

    private IntArrayStack intArrayStack;

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
        super();
        this.intArrayStack = intArrayStack;
    }

    public DefaultCountingOutRhymer() {
        this.intArrayStack = new IntArrayStack();
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

    public int countOut() {
        return intArrayStack.countOut();
    }

    public int getTotal() {
        return intArrayStack.getTotal();
    }

    public int peekaboo() {
        return intArrayStack.peekaboo();
    }

}
