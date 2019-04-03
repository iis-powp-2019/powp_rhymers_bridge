package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private IntArrayStack intArrayStack = new IntArrayStack();

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public DefaultCountingOutRhymer(){
        this.intArrayStack = null;
    }

    public static int getMaxSize() {
        return IntArrayStack.getMaxSize();
    }

    public static int getDefIndexStack() {
        return IntArrayStack.getDefIndexStack();
    }

    public static int getNotFound() {
        return IntArrayStack.getNotFound();
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
