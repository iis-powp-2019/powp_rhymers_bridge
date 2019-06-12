package edu.kis.vh.nursery;

public interface IStack {

    static final int EMPTY = 0;

    void countIn(int in);

    int getTotal();

    boolean callCheck();

    boolean isFull();

    int peekaboo();

    int countOut();

}