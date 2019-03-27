package edu.kis.vh.nursery.stackImplementation;

public class IntArrayStack implements StackInterface {

    private static final int CAPACITY = 12;
    private static final int MAX_SIZE = 11;
    private int[] numbers = new int[CAPACITY];

    private int total = EMPTY;


    /**
     * Get total
     * @return
     */
    public int getTotal() {
        return total;
    }

    /**
     * countIn
     * @param in
     */
    @Override
    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * callCheck
     * @return
     */
    @Override
    public boolean isEmpty() {
        return total == EMPTY;
    }

    /**
     * Checks if stack is full
     * @return
     */
    public boolean isFull() {
        return total == MAX_SIZE;
    }

    /**
     * peekaboo
     * @return
     */
    @Override
    public int top() {
        if (isEmpty())
            return EMPTY;
        return numbers[total];
    }

    /**
     * countOut
     * @return
     */
    public int pop() {
        if (isEmpty())
            return EMPTY;
        return numbers[total--];
    }


}
