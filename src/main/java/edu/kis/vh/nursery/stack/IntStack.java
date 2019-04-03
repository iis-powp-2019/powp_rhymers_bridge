package edu.kis.vh.nursery.stack;

public interface IntStack {
	
	static final int EMPTY_STACK_TOP = 0;

	int getTotal();

	void countIn(int in);

	boolean callCheck();

	boolean isFull();

	int countOut();
	
	int peekaboo();

}