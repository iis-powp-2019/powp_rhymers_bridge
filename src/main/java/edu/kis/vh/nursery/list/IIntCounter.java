package edu.kis.vh.nursery.list;

public interface IIntCounter
{
    int EMPTY_STACK_INDEX = 0;

    void push(int in);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
