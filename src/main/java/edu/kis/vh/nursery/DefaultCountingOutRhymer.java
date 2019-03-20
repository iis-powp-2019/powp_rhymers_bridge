package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int STACK_CAPACITY = 12;

	private static final int STACK_TOP = -1;

	private int[] numbers = new int[STACK_CAPACITY];

	private int total = STACK_TOP;

	public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == STACK_TOP;
	}
		
	public boolean isFull() {
		return total == STACK_CAPACITY - 1;
	}
		
	protected int peekaboo() {
		if (callCheck())
			return STACK_TOP;
		return numbers[total];
	}
			
	public int countOut() {
		if (callCheck())
			return STACK_TOP;
		return numbers[total--];
	}

}
