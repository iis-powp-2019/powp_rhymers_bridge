package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int STACK_CAPACITY = 12;
    private static final int EMPTY_STACK_VALUE = -1;

    private int[] numbers = new int[STACK_CAPACITY];
    private int total = EMPTY_STACK_VALUE;

    public void countIn(int in) {
        if (!isFull()) {
            numbers[++total] = in;
        }
    }

    boolean callCheck() {
        return total == EMPTY_STACK_VALUE;
    }

    boolean isFull() {
        return total == STACK_CAPACITY - 1;
    }

    int actualNumber() {
        if (callCheck()) {
            return EMPTY_STACK_VALUE;
        }

        return numbers[total];
    }

    public int countOut() {
        if (callCheck()) {
            return EMPTY_STACK_VALUE;
        }
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }

    public int[] getNumbers() {
        return numbers;
    }
}
