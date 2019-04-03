package edu.kis.vh.nursery;

public interface IIntCounter
{
    void push(int in);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
