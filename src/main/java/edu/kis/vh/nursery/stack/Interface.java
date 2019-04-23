package edu.kis.vh.nursery.stack;

public interface Interface {

    int STACK_VALUE = 0;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int getTotal();

    void setTotal(int total);

    int top();

    int pop();
}
