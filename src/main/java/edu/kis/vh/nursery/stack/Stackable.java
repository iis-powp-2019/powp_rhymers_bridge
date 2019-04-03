package edu.kis.vh.nursery.stack;

public interface Stackable {

    int STACK_EMPTY = 0;

    int getTotal();

    void countIn(int i);

    boolean callCheck();

    boolean isFull();

    int peekaboo();

    int countOut();
}
