package edu.kis.vh.nursery.collections;

public interface Collections {

    int EMPTY_VALUE = -1;

    int getCurrentSize();

    void push(int in);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
