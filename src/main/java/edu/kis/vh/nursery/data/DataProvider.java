package edu.kis.vh.nursery.data;


public interface DataProvider {

    void countIn(int in);

    boolean callCheck();

    boolean isFull();

    int peekaboo();

    int countOut();
}
