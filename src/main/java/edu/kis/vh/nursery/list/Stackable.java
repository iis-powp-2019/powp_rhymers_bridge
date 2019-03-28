package edu.kis.vh.nursery.list;

public interface Stackable {

    int getTotal();

    void countIn(int i);

    boolean callCheck();

    boolean isFull();

    int peekaboo();

    int countOut();
}
