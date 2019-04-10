package edu.kis.vh.nursery;

public interface StackInterface {

	/**
	 * Value to return when there is no numbers
	 */
	static final int DEFAULT_RETURN_VALUE = -1;

	void countIn(int in);

	int countOut();

	boolean callCheck();

	int peekaboo();

	boolean isFull();

}