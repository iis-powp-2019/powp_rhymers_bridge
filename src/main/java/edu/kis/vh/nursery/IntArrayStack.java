package edu.kis.vh.nursery;

/**
 * @author Maciek Implementing a stack of integers with pointer on last added element.
 */
public class IntArrayStack {

    /**
     * Index indicating that stack has no elements
     */
    private static final int STACK_EMPTY_INDEX = -1;

    /**
     * Index of stack overflow
     */
    private static final int STACK_MAX_SIZE = 12;

    /**
     * The collector of stack elements
     */
    private int[] numbers = new int[STACK_MAX_SIZE];

    /**
     * index of stack last element
     */
    private int total = -1;

    /**
     * Add new element to stack and increase index of stack last element
     *
     * @param in
     *            value added to stack
     */
    public void countIn(final int in) {
        if (!isFull()) {
            numbers[++total] = in;
        }
    }

    /**
     * @return true if stack is empty
     */
    public boolean callCheck() {
        return total == STACK_EMPTY_INDEX;
    }

    /**
     * @return true if stack is full, check the overflow
     */
    public boolean isFull() {
        return total == STACK_MAX_SIZE - 1;
    }

    /**
     * @return -1 if stack is empty or value in stack last element index
     */
    protected int peekaboo() {
        if (callCheck()) {
            return -1;
        }
        return numbers[total];
    }

    /**
     * @return -1 if stack is empty or value in last element index of collector and decrease last element index by 1
     */
    public int countOut() {
        if (callCheck()) {
            return -1;
        }
        return numbers[total--];
    }

    /**
     * @return last element index of stack
     */
    public int getTotal() {
        return total;
    }
}
