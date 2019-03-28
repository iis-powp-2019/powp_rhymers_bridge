package edu.kis.vh.nursery;

public interface StackInterface {
    public static final int EMPTY_STACK_HEAD_INDEX = -1;
    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    int getHead();
}
