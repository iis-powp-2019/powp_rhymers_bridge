package edu.kis.vh.nursery.storage;

public interface IntStack {

    public static int EMPTY_STACK_VALUE = 0;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    int getTotal();
}
