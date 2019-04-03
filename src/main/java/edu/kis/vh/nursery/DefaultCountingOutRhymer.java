package edu.kis.vh.nursery;

/**
 * Class of default type rhymer
 */
public class DefaultCountingOutRhymer {

    IntArrayStack stack;

    public DefaultCountingOutRhymer() {
        this.stack = new IntArrayStack();
    }

    public DefaultCountingOutRhymer(IntArrayStack stack) {
        this.stack = stack;
    }

    public int getTotal() {
        return stack.getTotal();
    }

    public void countIn(int IN) {
        stack.countIn(IN);
    }

    public boolean callCheck() {
        return stack.callCheck();
    }

    public boolean isFull() {
        return stack.isFull();
    }

    public int peekaboo() {
        return stack.peekaboo();
    }

    public int countOut() {
        return stack.countOut();
    }
}
