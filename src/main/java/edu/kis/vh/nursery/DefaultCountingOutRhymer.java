package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private IntArrayStack intArrayStack = new IntArrayStack();

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public DefaultCountingOutRhymer(){

    }

    public static int getEmptyFifo() {
        return IntArrayStack.getEmptyFifo();
    }

    public static int getFullFifo() {
        return IntArrayStack.getFullFifo();
    }

    public static int getCAPACITY() {
        return IntArrayStack.getCAPACITY();
    }

    public int[] getNumbers() {
        return intArrayStack.getNumbers();
    }

    public void setNumbers(int[] numbers) {
        intArrayStack.setNumbers(numbers);
    }

    public void setTotal(int total) {
        intArrayStack.setTotal(total);
    }

    public void countIn(int in) {
        intArrayStack.countIn(in);
    }

    public int countOut() {
        return intArrayStack.countOut();
    }

    public int getTotal() {
        return intArrayStack.getTotal();
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
}
