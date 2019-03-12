package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int CAPACITY = 12;
    private int MAX_SIZE = CAPACITY - 1;
    private int STARTING_POS = -1;


    private int[] numbers = new int[CAPACITY];

    public int total = STARTING_POS;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == STARTING_POS;
    }

    public boolean isFull() {
        return total == MAX_SIZE;
    }

    protected int peekaboo() {
        if (callCheck())
            return STARTING_POS;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return STARTING_POS;
        /*komentarz w ostatnio edytowanym miejscu*/return numbers[total--];
    }

}
