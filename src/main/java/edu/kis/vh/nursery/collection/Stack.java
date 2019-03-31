package edu.kis.vh.nursery.collection;

public interface Stack {
    int EMPTY = 0;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
