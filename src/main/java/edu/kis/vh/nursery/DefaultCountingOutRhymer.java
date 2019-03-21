package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    IntArrayStack intArrayStack;

    public DefaultCountingOutRhymer() {
        intArrayStack = new IntArrayStack();
    }

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
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

    public static int getCapacity() {
        return IntArrayStack.getCapacity();
    }

    public static int getIndexOutOfArray() {
        return IntArrayStack.getIndexOutOfArray();
    }

    public int[] getNumbers() {
        return intArrayStack.getNumbers();
    }

    public int getTotal() {
        return intArrayStack.getTotal();
    }


}
