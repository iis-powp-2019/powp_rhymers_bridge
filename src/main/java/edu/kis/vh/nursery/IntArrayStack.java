package edu.kis.vh.nursery;

public class IntArrayStack {

    private final int SIZE_NUMBER_ARRAY = 12;
    private final int STACK_EMPTY_SIZE = -1;
    private final int STACK_MAX_SIZE = 11;

    private int[] numbers = new int[SIZE_NUMBER_ARRAY];
    private int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    boolean callCheck() {
        return total == STACK_EMPTY_SIZE;
    }

    boolean isFull() {
        return total == STACK_MAX_SIZE;
    }

    int peekaboo() {
        if (callCheck())
            return STACK_EMPTY_SIZE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return STACK_EMPTY_SIZE;
        return numbers[total--];
    }
    //TODO: nalezy usunac nieuzywana metode
    public int getTotal() {
        return total;
    }
}
