package edu.kis.vh.nursery.list;

public interface Stack {

    void push(int newNodeValue);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
