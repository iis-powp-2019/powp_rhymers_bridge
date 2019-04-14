package edu.kis.vh.nursery.storage;

public interface IntStorageInterface {
	
    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    Node getLast();

    void setLast(Node last);

    int getSize();
    
    int getReturnedValue();

}
