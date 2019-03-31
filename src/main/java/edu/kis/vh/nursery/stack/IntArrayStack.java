package edu.kis.vh.nursery.stack;

public class IntArrayStack implements IntStackInterface {
    private final int CAPACITY = 12;
    private final int MAX_SIZE = CAPACITY - 1;

    private int[] numbers = new int[CAPACITY];

    private int total = STARTING_POS;

    public int getTotal() {
        return total;
    }

    /**
     * If stack is not full add param 'in' to stack
     * @param in number to add
     */
    @Override
    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Check if stack empty
     * @return 1 when is empty, 0 otherwise
     */
    @Override
    public boolean isEmpty() {
        return total == STARTING_POS;
    }

    /**
     * Check if stack is full
     * @return 1 when is full, 0 otherwise
     */
    @Override
    public boolean isFull() {
        return total == MAX_SIZE;
    }

    /**
     * Returns last added number to stack
     * @return -1 when if stack is empty and number otherwise
     */
    @Override
    public int top() {
        if (isEmpty())
            return STARTING_POS;
        return numbers[total];
    }

    /**
     * Returns last added number to stack and drop it
     * @return -1 when if stack is empty and number otherwise
     */
    @Override
    public int pop() {
        if (isEmpty())
            return STARTING_POS;
        return numbers[total--];
    }
}
