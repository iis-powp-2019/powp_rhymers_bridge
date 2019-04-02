package edu.kis.vh.nursery.stack;

public interface Stackable {

	static final int INDEX_OF_EMPTY_STACK = 0;
	
    void countIn(int i);

    boolean callCheck();

    boolean isFull();

    int peekaboo();

    int countOut();

    int getTotal();
}
