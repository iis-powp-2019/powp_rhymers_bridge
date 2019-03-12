package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int NUMBERS_QUANTITY = 12;
	private static final int EMPTY_STACK_INDICATOR = -1;
	private static final int FULL_STACK_INDICATOR = 11;

	private int[] numbers = new int[NUMBERS_QUANTITY];

    private int total = EMPTY_STACK_INDICATOR;

    public int getTotal() {
        return total;
    }

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	boolean isEmpty() {
		return total == EMPTY_STACK_INDICATOR;
	}

	boolean isFull() {
		return total == FULL_STACK_INDICATOR;
	}

	protected int peekaboo() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		return numbers[total];
	}

	public int countOut() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		return numbers[total--];
	}

}
