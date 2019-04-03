package edu.kis.vh.nursery.stacks;

public interface IIntStack {

    int ERROR_CODE = -1;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
