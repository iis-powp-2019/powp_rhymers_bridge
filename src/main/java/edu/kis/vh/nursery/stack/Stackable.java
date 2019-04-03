package edu.kis.vh.nursery.stack;

public interface Stackable {

    int EMPTY_STACK_VALUE = -1;

    void push(int value);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    int getTotal();
}
