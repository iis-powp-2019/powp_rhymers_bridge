package edu.kis.vh.nursery.stackBulider;

public interface StackInterface {
    int STACK_EMPTY = -1;


    int getTotal();

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
