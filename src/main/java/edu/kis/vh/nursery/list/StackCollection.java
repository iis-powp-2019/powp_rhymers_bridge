package edu.kis.vh.nursery.list;

public interface StackCollection {
    void push(int value);

    boolean isEmpty();

    boolean isFull();

    int getTop();

    int pop();
}
