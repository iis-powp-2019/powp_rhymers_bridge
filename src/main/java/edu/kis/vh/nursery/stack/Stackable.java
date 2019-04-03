package edu.kis.vh.nursery.stack;

public interface Stackable {

	int STACK_EMPTY_VALUE = 0;

	int getTotal();

	void countIn(int in);

	boolean callCheck();

	boolean isFull();

	int peekaboo();

	int countOut();

}