package edu.kis.vh.nursery.stack;

public interface Stackable {

    int getTotal();

    void countIn(int in);

    boolean callCheck();

    boolean isFull();

    int countOut();

    int peekaboo();
}
