package edu.kis.vh.nursery.stack;

import edu.kis.vh.nursery.IStack;

/**
 * Class implementing stack
 */
public class IntArrayStack implements IStack {
	
	private static final int NUMBERS_QUANTITY = 12;
	private static final int FULL_STACK_INDICATOR = 11;

	private int[] numbers = new int[NUMBERS_QUANTITY];

    private int total = EMPTY_STACK_INDICATOR;

    /**
     * @return amount of values currently on stack
     */
    @Override
	public int getTotal() {
        return total;
    }

    /**
     * Put value on stack
     * @param in value to put
     */
	@Override
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

    /**
     * Checks if stack is empty
     * @return true if stack is empty
     */
	@Override
	public boolean callCheck() {
		return total == EMPTY_STACK_INDICATOR;
	}

    /**
     * Checks if stack is full
     * @return true if stack is full
     */
	@Override
	public boolean isFull() {
		return total == FULL_STACK_INDICATOR;
	}

    /**
     * @return value from the top of the stack without removing it
     */
	@Override
	public int peekaboo() {
		if (callCheck())
			return EMPTY_STACK_INDICATOR;
		return numbers[total];
	}

    /**
     * @return value from the top of the stack and remove it
     */
	@Override
	public int countOut() {
		if (callCheck())
			return EMPTY_STACK_INDICATOR;
		return numbers[total--];
	}

}
