package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int capacity = 12;
    private static final int indexOutOfArray = -1;
    private int[] numbers = new int[capacity];

    private int total = indexOutOfArray;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == indexOutOfArray;
    }

    public boolean isFull() {
        return total == capacity - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return indexOutOfArray;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return indexOutOfArray;
        return numbers[total--];
    }

    public static int getCapacity() {
        return capacity;
    }

    public static int getIndexOutOfArray() {
        return indexOutOfArray;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
