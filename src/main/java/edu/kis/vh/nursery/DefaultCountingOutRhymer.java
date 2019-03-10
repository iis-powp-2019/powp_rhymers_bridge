package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int STACK_LAST_POSITION = 11;
    public static final int STACK_STARTING_POSITION = -1;
    public static final int STACK_VALUE_ON_STARTING_POSITION = -1;
    private int[] numbers = new int[12];

    public int total = STACK_STARTING_POSITION;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == STACK_STARTING_POSITION;
    }

    public boolean isFull() {
        return total == STACK_LAST_POSITION;
    }

    protected int peekaboo() {
        if (callCheck())
            return STACK_VALUE_ON_STARTING_POSITION;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return STACK_VALUE_ON_STARTING_POSITION;
        return numbers[total--];
    }

}

//Skrót ctr + shift + backspace cofa do ostatnio edytowanego pliku