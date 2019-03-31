package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] stack = new int[12];

    public int currIndex = -1;

    public void countIn(int in) {
        if (!isFull())
            stack[++currIndex] = in;
    }

    public boolean callCheck() {
        return currIndex == -1;
    }

    public boolean isFull() {
        return currIndex == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;

        return stack[currIndex];
    }

    public int countOut() {
        if (callCheck())
            return -1;

        return stack[currIndex--];
    }

}
