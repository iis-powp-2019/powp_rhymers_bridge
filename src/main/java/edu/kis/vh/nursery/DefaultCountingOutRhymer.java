package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int error = -1;

	private static final int maxArraySize = 12;

	private int[] numbers = new int[maxArraySize];

	private int total = error;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}
	
	public boolean callCheck() {
		return total == error;
	}
	
	public boolean isFull() {
		return total == 11;
	}
	
	public int getTotal() {
		return total;
	}
	
	protected int peekaboo() {
		if (callCheck())
			return error;
		return numbers[total];
	}
	
	public int countOut() {
		if (callCheck())
			return error;
		return numbers[total--];
	}
}
