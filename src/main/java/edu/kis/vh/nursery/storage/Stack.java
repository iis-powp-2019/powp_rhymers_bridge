package edu.kis.vh.nursery.storage;

public interface Stack {
    int EMPTY_STACK_SIZE = 0;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
