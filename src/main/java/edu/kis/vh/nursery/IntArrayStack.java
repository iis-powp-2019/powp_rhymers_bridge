package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.StackCollection;

public class IntArrayStack implements StackCollection {

	private static final int EMPTY_STACK_VALUE = -1;
	private static final int FULL_STACK_VALUE = 11;
	private static final int STACK_CAPACITY = 12;

	private final int[] numbers = new int[STACK_CAPACITY];

	private int totalCount = EMPTY_STACK_VALUE;

	private int getTotalCount() {
		return totalCount;
	}

	public void push(int newValue) {
		if (!isFull())
			numbers[++totalCount] = newValue;
	}

	public boolean isEmpty() {
		return totalCount == EMPTY_STACK_VALUE;
	}
		
	public boolean isFull() {
		return totalCount == FULL_STACK_VALUE;
	}
		
	public int getTop() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return numbers[totalCount];
	}
			
	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return numbers[totalCount--];
	}
}
