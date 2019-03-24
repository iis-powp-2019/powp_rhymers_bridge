package edu.kis.vh.nursery.storage;

public interface IntStorageInterface {


    int EMPTY = 0;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

}
