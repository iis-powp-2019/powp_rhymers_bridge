package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private int[] numbers = new int[12];

	public int totalCount = -1;

	public void countIn(int newValue) {
		if (!isFull())
			numbers[++totalCount] = newValue;
	}

	public boolean isEmpty() {
		return totalCount == -1;
	}
		
	public boolean isFull() {
		return totalCount == 11;
	}
		
	protected int getPeekaboo() {
		if (isEmpty())
			return -1;
		return numbers[totalCount];
	}
			
	public int countOut() {
		if (isEmpty())
			return -1;
		return numbers[totalCount--];
	}
}
