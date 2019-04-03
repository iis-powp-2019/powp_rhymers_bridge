package edu.kis.vh.nursery.stack;

public interface StackCollection {
    void push(int value);

    boolean isEmpty();

    boolean isFull();

    int getTop();

    int pop();
}
