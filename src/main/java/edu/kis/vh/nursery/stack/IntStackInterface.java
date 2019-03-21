package edu.kis.vh.nursery.stack;

public interface IntStackInterface {

    int EMPTY = -1;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    int getTotal();
}
