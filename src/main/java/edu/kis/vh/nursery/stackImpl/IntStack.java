package edu.kis.vh.nursery.stackImpl;

public interface IntStack {

    int STACK_EMPTY_INDEX = 0;

    void countIn(int in);

    boolean callCheck();

    boolean isFull();

    int peekaboo();

    int countOut();
}
