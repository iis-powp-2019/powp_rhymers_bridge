package edu.kis.vh.nursery;

/**
 * DefaultCountingOutRhymer is counting-out rhyme used to conducting complicated number games
 */
public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int STACK_EMPTY_VALUE = -1;
    private static final int STACK_FULL_VALUE = 11;

    private int[] NUMBERS = new int[CAPACITY];

    private int STACK_EMPTY_INDICATOR = STACK_EMPTY_VALUE; //STACK_EMPTY_INDICATOR wskazuje ostatni element

    /**
     * @return STACK_EMPTY_INDICATOR
     */
    public int getSTACK_EMPTY_INDICATOR() {
        return STACK_EMPTY_INDICATOR;
    }

    /**
     * @param in value added to stack
     */
    public void countIn(final int in) {
        if (!isFull())
            NUMBERS[++STACK_EMPTY_INDICATOR] = in;
    }

    /**
     * @return true if stack is empty
     */
    public boolean callCheck() {
        return STACK_EMPTY_INDICATOR == STACK_EMPTY_VALUE;
    }

    /**
     * @return true if stack is full
     */
    public boolean isFull() {
        return STACK_EMPTY_INDICATOR == STACK_FULL_VALUE;
    }

    /**
     * @return STACK_EMPTY_VALUE if stack is empty, if stack is not empty then returns value pointed by STACK_EMPTY_INDICATOR
     */
    protected int peekaboo() {
        if (callCheck())
            return STACK_EMPTY_VALUE;
        return NUMBERS[STACK_EMPTY_INDICATOR];
    }

    /**
     * @return STACK_EMPTY_VALUE if stack is empty, if stack is not empty then returns value pointed by STACK_EMPTY_INDICATOR
     * and after that decrements STACK_EMPTY_INDICATOR
     */
    public int countOut() {
        if (callCheck())
            return STACK_EMPTY_VALUE;
        return NUMBERS[STACK_EMPTY_INDICATOR--];
    }

}
