package edu.kis.vh.nursery;

public class IntArrayStack {

	private static final int STACK_CAPACITY = 12;

	private static final int EMPTY_STACK_TOP = -1;

	private int[] numbers = new int[STACK_CAPACITY];

	private int total = EMPTY_STACK_TOP;

	public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == EMPTY_STACK_TOP;
	}
		
	public boolean isFull() {
		return total == STACK_CAPACITY - 1;
	}
		
	protected int peekaboo() {
		if (callCheck())
			return EMPTY_STACK_TOP;
		return numbers[total];
	}
			
	public int countOut() {
		if (callCheck())
			return EMPTY_STACK_TOP;
		return numbers[total--];
	}
}
