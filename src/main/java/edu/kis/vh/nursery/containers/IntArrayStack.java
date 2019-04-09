package edu.kis.vh.nursery.containers;

import edu.kis.vh.nursery.IStackInterface;

public class IntArrayStack implements IStackInterface{

	private static final int EMPTY = 0;
	private static final int SIZE = 12;
	private static final int FULL = SIZE;

	private int[] numbers = new int[SIZE];

	private int total = EMPTY;

	@Override
	public void countIn(final int in) {
		if (!isFull())
			numbers[total++] = in;
	}

	@Override
	public boolean callCheck() {
		return total == EMPTY;
	}
		
	public boolean isFull() {
		return total == FULL;
	}
		
	@Override
	public int peekaboo() {
		if (callCheck())
			return EMPTY;
		
		return numbers[total];
	}

	@Override
	public int countOut() {
		if (callCheck())
			return EMPTY;
		return numbers[total--];
	}
	
}
