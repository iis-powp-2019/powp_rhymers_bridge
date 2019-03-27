package edu.kis.vh.nursery.datastructures;

public interface IIntLinkedList {

    int EMPTY_VALUE = -1;

    void push(int i);

    boolean isEmpty();

    //TODO: zawsze zwraca false
    boolean isFull();

    int top();

    int pop();
}
