package edu.kis.vh.nursery;

public interface Rhymer {
    int RHYMER_EMPTY = 0;

    void countIn(int in);

    boolean callCheck();

    boolean isFull();

    int countOut();

    int peekaboo();
}
