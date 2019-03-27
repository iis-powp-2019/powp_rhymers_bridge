package edu.kis.vh.nursery.list;


public interface DataProvider {

    void countIn(int in);

    boolean callCheck();

    boolean isFull();

    int peekaboo();

    int countOut();
}
