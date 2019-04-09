package edu.kis.vh.nursery;

public interface Stack {
    int EMPTY_STACK_INDICATOR = 0;

    int getTotal();

    void countIn(int in);

    boolean callCheck();

    boolean isFull();

    int peekaboo();

    int countOut();
}
