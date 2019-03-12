package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int capacity = 12;
    public static final int array_initial_index = -1;
    public static final int max_size = capacity-1;
    private int[] numbers = new int[capacity];

    public int head = array_initial_index;

    public void countIn(int in) {
        if (!isFull())
            numbers[++head] = in;
    }

    public boolean callCheck() {
        return head == array_initial_index;
    }

    public boolean isFull() {
        return head == max_size;
    }

    protected int peekaboo() {
        if (callCheck())
            return array_initial_index;
        return numbers[head];
    }

    public int countOut() {
        if (callCheck())
            return array_initial_index;
        return numbers[head--];
    }

}
