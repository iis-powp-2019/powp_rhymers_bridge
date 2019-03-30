package edu.kis.vh.nursery.storage;

public interface StackableInterface {

    int EMPTY_STACK_HEAD_INDEX = -1;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
