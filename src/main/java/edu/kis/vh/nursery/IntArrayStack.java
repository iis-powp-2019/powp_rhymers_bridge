package edu.kis.vh.nursery;

public class IntArrayStack {
    private final int CAPACITY = 12;
    private final int MAX_SIZE = CAPACITY - 1;
    private final int STARTING_POS = -1;

    private int[] numbers = new int[CAPACITY];

    private int total = STARTING_POS;

    public int getTotal() {
        return total;
    }

    /**
     * If stack is not full add param 'in' to stack
     * @param in number to add
     */
    void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Check if stack empty
     * @return 1 when is empty, 0 otherwise
     */
    boolean callCheck() {
        return total == STARTING_POS;
    }

    /**
     * Check if stack is full
     * @return 1 when is full, 0 otherwise
     */
    boolean isFull() {
        return total == MAX_SIZE;
    }

    /**
     * Returns last added number to stack
     * @return -1 when if stack is empty and number otherwise
     */
    int peekaboo() {
        if (callCheck())
            return STARTING_POS;
        return numbers[total];
    }

    /**
     * Returns last added number to stack and drop it
     * @return -1 when if stack is empty and number otherwise
     */
    int countOut() {
        if (callCheck())
            return STARTING_POS;
        return numbers[total--];
    }
}
