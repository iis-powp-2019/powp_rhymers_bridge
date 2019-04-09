package edu.kis.vh.nursery.dataStructures;

public interface DataStructure {

    int EMPTY_INDEX = 0;

    void countIn(int in);

    boolean callCheck();

    boolean isFull();

    int peekaboo();

    int countOut();
}
