package edu.kis.vh.nursery;

public interface Rhymer {
    int RHYMER_EMPTY = -1;

    void countIn(int in);

    boolean callCheck();

    boolean isFull();

    int countOut();

    int peekaboo();
}
