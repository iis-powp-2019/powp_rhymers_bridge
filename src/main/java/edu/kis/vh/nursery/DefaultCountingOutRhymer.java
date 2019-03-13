package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int capacity = 12;
    private static final int array_initial_index = -1;
    private static final int max_size = capacity-1;

    private int[] numbers = new int[capacity];

    private int total = array_initial_index;

    /**
     * Returns total amount of elements in stack
     * @return -1 if stack is empty, otherwise total amount
     */
    public int getTotal() {
        return total;
    }

    /**
     * Inserts a number into stack if the stack is not full
     * @param in number you want to add to stack
     */
    void countIn(final int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Checks if the stack is empty
     * @return true if the stack empty, false if not
     */
    boolean callCheck() {
        return total == array_initial_index;
    }

    /**
     * Checks if the stack is full
     * @return true if the stack is full, false if not
     */
    boolean isFull() {
        return total == max_size;
    }

    /**
     * Returns the top value of stack
     * @return -1 if stack is empty, number if not empty
     */
    int peekaboo() {
        if (callCheck())
            return array_initial_index;
        return numbers[total];
    }

    /**
     * Returns and deletes the top value of stack
     * @return -1 if stack is empty, number if not empty
     */
    int countOut() {
        if (callCheck())
            return array_initial_index;
        return numbers[total--];
    }

}
