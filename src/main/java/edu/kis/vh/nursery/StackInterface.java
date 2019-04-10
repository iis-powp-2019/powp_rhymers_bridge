package edu.kis.vh.nursery;

public interface StackInterface {

	/**
	 * Value to return when there is no numbers
	 */
	static final int EMPTY_VALUE = 0;

	void countIn(int in);

	int countOut();

	boolean callCheck();

	int peekaboo();

	boolean isFull();

}