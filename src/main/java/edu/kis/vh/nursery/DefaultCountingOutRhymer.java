package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int STACK_FULL_VALUE = 11;

	private static final int STACK_EMPTY_VALUE = -1;

	private static final int STACK_MAX_CAPACITY = 12;

	private int[] numbers = new int[STACK_MAX_CAPACITY];

	public int total = STACK_EMPTY_VALUE;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == STACK_EMPTY_VALUE;
	}

	public boolean isFull() {
		return total == STACK_FULL_VALUE;
	}

	protected int peekaboo() {
		if (callCheck())
			return STACK_EMPTY_VALUE;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return STACK_EMPTY_VALUE;
		return numbers[total--];
	}

}

//alt + -> przechodzi do edytowanego pliku "następnego"
//alt + <- przechodzi do edytowanego pliku "poprzedniego"
