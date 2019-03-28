package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.list.IntStorage;

public class IntArrayStack implements IntStorage{

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
    @Override
    public void push(final int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Checks if the stack is empty
     * @return true if the stack empty, false if not
     */
    @Override
    public boolean isEmpty() {
        return total == array_initial_index;
    }

    /**
     * Checks if the stack is full
     * @return true if the stack is full, false if not
     */
    @Override
    public boolean isFull() {
        return total == max_size;
    }

    /**
     * Returns the top value of stack
     * @return -1 if stack is empty, number if not empty
     */
    @Override
    public int top() {
        if (isEmpty())
            return array_initial_index;
        return numbers[total];
    }

    /**
     * Returns and deletes the top value of stack
     * @return -1 if stack is empty, number if not empty
     */
    @Override
    public int pop() {
        if (isEmpty())
            return array_initial_index;
        return numbers[total--];
    }
}
