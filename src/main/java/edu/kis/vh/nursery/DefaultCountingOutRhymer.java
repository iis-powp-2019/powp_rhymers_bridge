package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int NUMBERS_QUANTITY = 12;
	public static final int EMPTY_STACK_INDICATOR = -1;
	public static final int FULL_STACK_INDICATOR = 11;

	private int[] numbers = new int[NUMBERS_QUANTITY];

	public int total = EMPTY_STACK_INDICATOR;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean isEmpty() {
		return total == EMPTY_STACK_INDICATOR;
	}

	public boolean isFull() {
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
