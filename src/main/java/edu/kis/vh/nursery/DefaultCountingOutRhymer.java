package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    IntArrayStack intArrayStack = new IntArrayStack();

    public DefaultCountingOutRhymer(){

    }

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public static int getEmptyStackHeadIndex() {
        return IntArrayStack.getEmptyStackHeadIndex();
    }

    public static int getFullStackHeadIndex() {
        return IntArrayStack.getFullStackHeadIndex();
    }

    public static int getCAPACITY() {
        return IntArrayStack.getCAPACITY();
    }

    public int getTotal() {
        return intArrayStack.getTotal();
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
