package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int FULL_STACK_SIZE = 12;
    public static final int EMPTY_STACK_SIZE = -1;

    private int[] numbers = new int[FULL_STACK_SIZE];
    public int total = EMPTY_STACK_SIZE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    }


    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
