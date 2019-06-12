package edu.kis.vh.nursery;

public interface IStack {

    static final int EMPTY = -1;

    void countIn(int in);

    int getTotal();

    boolean callCheck();

    boolean isFull();

    int peekaboo();

    int countOut();

}