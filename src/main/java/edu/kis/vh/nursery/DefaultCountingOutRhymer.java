package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int minusOne = -1;
    private static final int eleven = 11;
    private static final int twelve = 12;
    private int[] numbers = new int[twelve];

    private int total = minusOne;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    boolean callCheck() {
        return total == minusOne;
    }

    boolean isFull() {
        return total == eleven;
    }

    int peekaboo() {
        if (callCheck())
            return minusOne;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return minusOne;
        return numbers[total--];
    }

}
