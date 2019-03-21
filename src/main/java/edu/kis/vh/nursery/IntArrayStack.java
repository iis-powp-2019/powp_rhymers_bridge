package edu.kis.vh.nursery;

public class IntArrayStack {
    private static final int EMPTY = -1;
    private static final int NUMBERS_SIZE = 12;
    private static final int FULL = 11;
    private int[] numbers = new int[getNumbersSize()];

    private int total = getEMPTY();

    private static int getEMPTY() {
        return EMPTY;
    }

    private static int getNumbersSize() {
        return NUMBERS_SIZE;
    }

    private static int getFULL() {
        return FULL;
    }

    public void countIn(int in) {
        if (!isFull())
            getNumbers()[++total] = in;
    }

    boolean callCheck() {
        return total == getEMPTY();
    }

    boolean isFull() {
        return total == getFULL();
    }

    int peekaboo() {
        if (callCheck())
            return getEMPTY();
        return getNumbers()[total];
    }

    public int countOut() {
        if (callCheck())
            return getEMPTY();
        return getNumbers()[total--];
    }

    public int getTotal() {
        return total;
    }

    private int[] getNumbers() {
        return numbers;
    }
}
