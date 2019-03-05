package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int STACK_SIZE = 12;
    public static final int EMPTY_FLAG = -1;
    public static final int FULL_FLAG = 11;
    private int[] numbers = new int[STACK_SIZE];

    public int total = EMPTY_FLAG;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_FLAG;
    }

    public boolean isFull() {
        return total == FULL_FLAG;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_FLAG;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_FLAG;
        return numbers[total--];
    }

}
