package edu.kis.vh.nursery.structures;



/**
 * Class which counting down, which is working like a stack.
 */
public class IntArrayStack implements LinkedListInterface {

    private static final int MAX = 11;
    private static final int MAX_SIZE_NUMBERS = 12;
    private int[] numbers = new int[MAX_SIZE_NUMBERS];

    private int total = -1;

    /**
     * @param IN number which is using to fill the stack.
     */
    public void push(final int IN) {
        if (!isFull())
            numbers[++total] = IN;
    }

    /**
     * @return return true, if stack is empty and false, if it's not.
     */
    public boolean isEmpty() {
        return total == LAST_INDEX;
    }

    /**
     * @return return true, if stack is full and false, if stack is not.
     */
    public boolean isFull() {
        return total == MAX;
    }

    /**
     * @return return -1, if stack is empty or actual element, if its not.
     */
    public int top() {
        if (isEmpty())
            return LAST_INDEX;
        return numbers[total];
    }

    /**
     * @return return -1, if stack is empty or under the top element, if its not.
     */
    public int pop() {
        if (isEmpty())
            return LAST_INDEX;
        return numbers[total--];
    }

}
