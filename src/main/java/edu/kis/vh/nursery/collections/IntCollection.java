package edu.kis.vh.nursery.collections;

public interface IntCollection {
    int STACK_STARTING_POSITION = -1;
    int STACK_VALUE_ON_STARTING_POSITION = -1;
    void push(int x);
    boolean isEmpty();
    boolean isFull();
    int top();
    int pop();
    int getElementCount();

}
