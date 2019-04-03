package edu.kis.vh.nursery.stack;

public interface StackCollection {
    int EMPTY_VALUE = 0;

    void push(int value);

    boolean isEmpty();

    boolean isFull();

    int getTop();

    int pop();
}
