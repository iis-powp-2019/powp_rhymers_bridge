package edu.kis.vh.nursery;

public class IntArrayStack {
    private int CAPACITY = 12;
    private int MAX_SIZE = CAPACITY - 1;
    private int STARTING_POS = -1;


    private int[] numbers = new int[CAPACITY];

    private int total = STARTING_POS;

    public int getTotal() {
        return total;
    }

    void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    boolean callCheck() {
        return total == STARTING_POS;
    }

    boolean isFull() {
        return total == MAX_SIZE;
    }

    int peekaboo() {
        if (callCheck())
            return STARTING_POS;
        return numbers[total];
    }

    int countOut() {
        if (callCheck())
            return STARTING_POS;
        return numbers[total--];
    }
}
