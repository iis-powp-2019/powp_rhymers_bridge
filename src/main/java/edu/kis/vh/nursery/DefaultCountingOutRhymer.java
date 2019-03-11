package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX_SIZE_OF_QUEUE = 12;
    public static final int EMPTY_POSITION = -1;
    private int[] queue = new int[MAX_SIZE_OF_QUEUE];

    public int currentIndex = EMPTY_POSITION;

    public void countIn(int in) {
        if (!isFull())
            queue[++currentIndex] = in;
    }

    public boolean callCheck() {
        return currentIndex == EMPTY_POSITION;
    }

    public boolean isFull() {
        return currentIndex == MAX_SIZE_OF_QUEUE - 1;
    }

    protected int peekaboo() {
        if (callCheck()) {
            return EMPTY_POSITION;
        }
        return queue[currentIndex];
    }

    public int countOut() {
        if (callCheck()) {
            return EMPTY_POSITION;
        }
        return queue[currentIndex--];
    }

}
