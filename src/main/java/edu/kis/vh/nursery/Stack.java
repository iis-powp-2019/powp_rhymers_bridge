package edu.kis.vh.nursery;

public interface Stack {
    int EMPTY_STACK_INDICATOR = -1;

    int getTotal();

    void countIn(int in);

    boolean callCheck();

    boolean isFull();

    int peekaboo();

    int countOut();
}
