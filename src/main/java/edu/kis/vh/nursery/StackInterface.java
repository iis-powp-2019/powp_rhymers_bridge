package edu.kis.vh.nursery;

public interface StackInterface {
    static final int ERROR_NUMBER = -1;

    void countIn(int in);

    boolean callCheck();

    boolean isFull();

    int countOut();
}
