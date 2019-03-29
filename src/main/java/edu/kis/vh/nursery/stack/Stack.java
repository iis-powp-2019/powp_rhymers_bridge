package edu.kis.vh.nursery.stack;

public interface Stack {

    int EMPTY_STACK_VALUE = 0;

	int getTotal();

    void countIn(int in);

    boolean callCheck();

    boolean isFull();

    int peekaboo();

    int countOut();

}
