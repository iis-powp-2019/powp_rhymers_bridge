package edu.kis.vh.nursery.newStackImplementaion;

public class IntArrayStack implements StackInterface{

	private static final int error = -1;

	private static final int maxArraySize = 12;

	private int[] numbers = new int[maxArraySize];

	private int total = error;

	@Override
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}
	
	@Override
	public boolean callCheck() {
		return total == error;
	}
	
	@Override
	public boolean isFull() {
		return total == 11;
	}
	
	public int getTotal() {
		return total;
	}
	
	public int peekaboo() {
		if (callCheck())
			return error;
		return numbers[total];
	}
	
	@Override
	public int countOut() {
		if (callCheck())
			return error;
		return numbers[total--];
	}
}
