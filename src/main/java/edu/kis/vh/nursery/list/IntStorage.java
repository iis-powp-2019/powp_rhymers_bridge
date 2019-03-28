package edu.kis.vh.nursery.list;

public interface IntStorage {
    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
