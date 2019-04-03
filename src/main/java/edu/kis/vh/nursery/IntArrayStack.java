package edu.kis.vh.nursery;


public class IntArrayStack {
    private static final int STACK_VALUE = -1;
    private static final int STACK_MAX_SIZE = 12;
    private int[] NUMBERS = new int[STACK_MAX_SIZE];

    public int getTotal() {
        return total;
    }

    private int total = STACK_VALUE;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == STACK_VALUE;
    }


    public boolean isFull() {
        return total == 11;
    }

    public int peekaboo() {
        if (callCheck())
            return STACK_VALUE;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return STACK_VALUE;
        return NUMBERS[total--];
    }

}
