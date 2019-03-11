package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] queue = new int[12];

    public int currentIndex = -1;

    public void countIn(int in) {
        if (!isFull())
            queue[++currentIndex] = in;
    }

    public boolean callCheck() {
        return currentIndex == -1;
    }

    public boolean isFull() {
        return currentIndex == 11;
    }

    protected int peekaboo() {
        if (callCheck()) {
            return -1;
        }
        return queue[currentIndex];
    }

    public int countOut() {
        if (callCheck()) {
            return -1;
        }
        return queue[currentIndex--];
    }

}
