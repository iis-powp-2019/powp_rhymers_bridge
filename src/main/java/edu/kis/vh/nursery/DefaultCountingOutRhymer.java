package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int INDEX = -1;

	private static final int MAXSIZE = 12;

	private int[] numbers = new int[MAXSIZE];

	public int total = INDEX;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == INDEX;
	}

	public boolean isFull() {
		return total == MAXSIZE-1;
	}

	protected int peekaboo() {
		if (callCheck())
			return INDEX;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return INDEX;
		return numbers[total--];
	}

}
