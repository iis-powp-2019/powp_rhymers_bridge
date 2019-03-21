package edu.kis.vh.nursery.stack;

public class IntArrayStack implements IntStackInterface {

    private static final int EMPTY_FIFO = -1;
    private static final int FULL_FIFO = 11;
    private static final int CAPACITY = 12;
    private int[] numbers = new int[CAPACITY];

    private int total = EMPTY_FIFO;

    public static int getEmptyFifo() {
        return EMPTY_FIFO;
    }

    public static int getFullFifo() {
        return FULL_FIFO;
    }

    public static int getCAPACITY() {
        return CAPACITY;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    @Override
    public boolean isEmpty() {
        return total == EMPTY_FIFO;
    }

    @Override
    public boolean isFull() {
        return total == FULL_FIFO;
    }

    @Override
    public int top() {
        if (isEmpty())
            return EMPTY_FIFO;
        return numbers[total];
    }

    @Override
    public int pop() {
        if (isEmpty())
            return EMPTY_FIFO;
        return numbers[total--];
    }

    @Override
    public int getTotal() {
        return total;
    }
}
