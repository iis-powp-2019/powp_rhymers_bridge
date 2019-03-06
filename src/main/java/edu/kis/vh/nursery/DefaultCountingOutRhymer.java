package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int DEFAULT_INDEX = -1;
    public static final int MAX_STACK_CAPACITY = 12;

    private int[] numbers = new int[MAX_STACK_CAPACITY];

    public int total = DEFAULT_INDEX;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean isCheck() {
        return total == DEFAULT_INDEX;
    }

    public boolean isFull() {
        return total == MAX_STACK_CAPACITY - 1;
    }

    protected int peekaboo() {
        if (isCheck())
            return DEFAULT_INDEX;

        return numbers[total];
    }

    public int countOut() {
        if (isCheck())
            return DEFAULT_INDEX;

        return numbers[total--];
    }

}
