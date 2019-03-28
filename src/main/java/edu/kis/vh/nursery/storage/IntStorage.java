package edu.kis.vh.nursery.storage;

public interface IntStorage {
    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
