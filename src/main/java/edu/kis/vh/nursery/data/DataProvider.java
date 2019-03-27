package edu.kis.vh.nursery.data;


public interface DataProvider {

    int STACK_CAPACITY = 12;
    int EMPTY_POSITION = 0;

    void countIn(int in);

    boolean callCheck();

    boolean isFull();

    int peekaboo();

    int countOut();
}
