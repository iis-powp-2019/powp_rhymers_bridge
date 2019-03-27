package edu.kis.vh.nursery;

public interface IntStack {

    static final int EMPTY_INDEX = -1;

    int getTotal();

    void countIn(int in);

    boolean callCheck();

    boolean isFull();

    int peekaboo();

    int countOut();
}
