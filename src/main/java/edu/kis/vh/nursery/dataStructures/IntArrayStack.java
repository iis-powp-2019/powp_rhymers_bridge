package edu.kis.vh.nursery.dataStructures;

public class IntArrayStack implements DataStructure {

    private static final int STACK_MAX = 12;
    private final int[] numbers = new int[STACK_MAX];

    private int total = EMPTY_INDEX;

    @Override
    public void countIn(int in) {
        if (!isFull())
            numbers[total++] = in;
    }

    @Override
    public boolean callCheck() {
        return total == EMPTY_INDEX;
    }

    @Override
    public boolean isFull() {
        return total == STACK_MAX;
    }

    @Override
    public int peekaboo() {
        if (callCheck())
            return EMPTY_INDEX;
        return numbers[total];
    }

    @Override
    public int countOut() {
        if (callCheck())
            return EMPTY_INDEX;
        return numbers[--total];
    }

    public int getTotal() {
        return total;
    }
}
