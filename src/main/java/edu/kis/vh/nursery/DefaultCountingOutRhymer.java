package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static int getMaxValue() {
        return IntArrayStack.getMaxValue();
    }

    public static int getDefaultIndex() {
        return IntArrayStack.getDefaultIndex();
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

    public int[] getNUMBERS() {
        return intArrayStack.getNUMBERS();
    }

    private IntArrayStack intArrayStack;

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public DefaultCountingOutRhymer(){
        this.intArrayStack = new IntArrayStack();
    }


}
