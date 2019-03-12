package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int capacity = 12;
    private static final int array_initial_index = -1;
    private static final int max_size = capacity-1;

    private int[] numbers = new int[capacity];

    private int total = array_initial_index;

    public int getTotal() {
        return total;
    }

    void countIn(final int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    boolean callCheck() {
        return total == array_initial_index;
    }

    boolean isFull() {
        return total == max_size;
    }

    int peekaboo() {
        if (callCheck())
            return array_initial_index;
        return numbers[total];
    }

    int countOut() {
        if (callCheck())
            return array_initial_index;
        return numbers[total--];
    }

}
