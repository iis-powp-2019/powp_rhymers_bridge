package edu.kis.vh.nursery.stack;

public class IntArrayStack implements Stackable {

	private static final int STACK_MAX_CAPACITY = 12;
	private static final int STACK_FULL_VALUE = STACK_MAX_CAPACITY - 1;

	private final int[] numbers = new int[STACK_MAX_CAPACITY];

	private int total = Stackable.STACK_EMPTY_VALUE;

	@Override
	public int getTotal() {
		return total;
	}

	@Override
	public void countIn(final int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	@Override
	public boolean callCheck() {
		return total == Stackable.STACK_EMPTY_VALUE-1;
	}

	@Override
	public boolean isFull() {
		return total == STACK_FULL_VALUE;
	}

	@Override
	public int peekaboo() {
		if (callCheck())
			return Stackable.STACK_EMPTY_VALUE;
		return numbers[total];
	}

	@Override
	public int countOut() {
		if (callCheck())
			return Stackable.STACK_EMPTY_VALUE;
		return numbers[total--];
	}

}
