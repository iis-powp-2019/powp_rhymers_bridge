package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.intStack.Stackable;

public class IntArrayStack implements Stackable {

    private static final int CAPACITY = 12;
    private static final int STACK_EMPTY_VALUE = -1;
    private static final int STACK_FULL_VALUE = 11;

    private int[] numbers = new int[CAPACITY];

    private int total = STACK_EMPTY_VALUE; //total wskazuje ostatni element

    /**
     * @return STACK_EMPTY_INDICATOR
     */
    @Override
    public int getTotal() {
        return total;
    }

    /**
     * @param in value added to stack
     */
    @Override public void countIn(final int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * @return true if stack is empty
     */
    @Override public boolean callCheck() {
        return total == STACK_EMPTY_VALUE;
    }

    /**
     * @return true if stack is full
     */
    @Override public boolean isFull() {
        return total == STACK_FULL_VALUE;
    }

    /**
     * @return STACK_EMPTY_VALUE if stack is empty, if stack is not empty then returns value pointed by STACK_EMPTY_INDICATOR
     */
    @Override
     public int peekaboo() {
        if (callCheck())
            return STACK_EMPTY_VALUE;
        return numbers[total];
    }

    /**
     * @return STACK_EMPTY_VALUE if stack is empty, if stack is not empty then returns value pointed by total
     * and after that decrements total
     */
    @Override public int countOut() {
        if (callCheck())
            return STACK_EMPTY_VALUE;
        return numbers[total--];
    }

}

