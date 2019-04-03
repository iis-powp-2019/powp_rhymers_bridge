package edu.kis.vh.nursery;

public class IntArrayStack {
	
	private static final int NUMBERS_QUANTITY = 12;
	private static final int EMPTY_STACK_INDICATOR = -1;
	private static final int FULL_STACK_INDICATOR = 11;

	private int[] numbers = new int[NUMBERS_QUANTITY];

    private int total = EMPTY_STACK_INDICATOR;

    /**
     * @return amount of values currently on stack
     */
    public int getTotal() {
        return total;
    }

    /**
     * Put value on stack
     * @param in value to put
     */
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

    /**
     * Checks if stack is empty
     * @return true if stack is empty
     */
	public boolean isEmpty() {
		return total == EMPTY_STACK_INDICATOR;
	}

    /**
     * Checks if stack is full
     * @return true if stack is full
     */
	public boolean isFull() {
		return total == FULL_STACK_INDICATOR;
	}

    /**
     * @return value from the top of the stack without removing it
     */
	public int peekaboo() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		return numbers[total];
	}

    /**
     * @return value from the top of the stack and remove it
     */
	public int countOut() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		return numbers[total--];
	}

}
