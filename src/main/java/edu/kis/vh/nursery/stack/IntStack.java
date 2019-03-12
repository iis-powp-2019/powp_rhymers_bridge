package edu.kis.vh.nursery.stack;

public interface IntStack {

	static final int EMPTY_INDEX = 0;

	int getTotal();

	void countIn(int in);

	boolean callCheck();

	boolean isFull();

	public int peekaboo();

	int countOut();
}
