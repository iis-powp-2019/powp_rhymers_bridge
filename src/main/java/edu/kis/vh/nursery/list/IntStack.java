package edu.kis.vh.nursery.list;

public interface IntStack {

    public static int EMPTY_STACK_VALUE = 0;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    int getTotal();
}
