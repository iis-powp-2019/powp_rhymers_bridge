package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int STACK_CAPACITY = 12;
    private static final int MIN_TOTAL_VALUE = -1;
    private int[] numbers = new int[getStackCapacity()];

    public static int getStackCapacity() {
        return STACK_CAPACITY;
    }

    public static int getMinTotalValue() {
        return MIN_TOTAL_VALUE;
    }

    public int getTotal() {
        return total;
    }

    private int total = getMinTotalValue();

    public void countIn(int in) {
        if (!isFull())
            getNumbers()[++total] = in;
    }

    boolean callCheck() {
        return total == getMinTotalValue();
    }

    boolean isFull() {
        return total == 11;
    }

    int peekaboo() {
        if (callCheck())
            return -1;
        return getNumbers()[total];
    }

    int countOut() {
        if (callCheck())
            return -1;
        return getNumbers()[total--];
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
}
