package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private IntArrayStack intArrayStack;

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public DefaultCountingOutRhymer() {
        this.intArrayStack = new IntArrayStack();
    }

    public static int getDefaultIndexStack() {
        return IntArrayStack.getDefaultIndexStack();
    }

    public static int getNotFoundReturn() {
        return IntArrayStack.getNotFoundReturn();
    }

    public static int getMaxSizeStack() {
        return IntArrayStack.getMaxSizeStack();
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

    public int[] getNumbers() {
        return intArrayStack.getNumbers();
    }
}


