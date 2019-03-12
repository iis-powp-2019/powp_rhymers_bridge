package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int capacity = 12;
    private static final int array_initial_index = -1;
    private static final int max_size = capacity-1;
    private int[] numbers = new int[capacity];

    private int head = array_initial_index;

    void countIn(int in) {
        if (!isFull())
            numbers[++head] = in;
    }

    boolean callCheck() {
        return head == array_initial_index;
    }

    boolean isFull() {
        return head == max_size;
    }

    int peekaboo() {
        if (callCheck())
            return array_initial_index;
        return numbers[head];
    }

    int countOut() {
        if (callCheck())
            return array_initial_index;
        return numbers[head--];
    }

}
