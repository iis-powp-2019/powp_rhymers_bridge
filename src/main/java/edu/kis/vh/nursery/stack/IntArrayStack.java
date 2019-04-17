package edu.kis.vh.nursery.stack;

import edu.kis.vh.nursery.IStack;

public class IntArrayStack implements IStack {

	private static final int STACK_CAPACITY = 12;

	private final int[] numbers = new int[STACK_CAPACITY];

	public int total = EMPTY;

	@Override
	public void countIn(final int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	@Override
	public int getTotal() {
		return total;
	}

	@Override
	public boolean callCheck() {
		return total == EMPTY;
	}

	@Override
	public boolean isFull() {
		return total == STACK_CAPACITY - 1;
	}

	@Override
	public int peekaboo() {
		if (callCheck())
<<<<<<< HEAD
			return 0;
=======
			return EMPTY;
>>>>>>> 54c72ce603925235c0560bb4c165a1aff65eff6c
		return numbers[total];
	}

	@Override
	public int countOut() {
		if (callCheck())
<<<<<<< HEAD
			return 0;
=======
			return EMPTY;
>>>>>>> 54c72ce603925235c0560bb4c165a1aff65eff6c
		return numbers[total--];
	}
}
