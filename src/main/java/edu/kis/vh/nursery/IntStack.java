package edu.kis.vh.nursery;

public interface IntStack {

	/**
	 * @return total elements
	 */
	int getTotal();

	/**
	 * @param in insert in on top of stack
	 */
	void countIn(int in);

	/**
	 * @return true if empty
	 */
	boolean callCheck();

	/**
	 * @return true if full
	 */
	boolean isFull();

	/**
	 * @return number from top of the stack
	 */
	int peekAboo();

	/**
	 * @return number removed from top of the stack
	 */
	int countOut();

}