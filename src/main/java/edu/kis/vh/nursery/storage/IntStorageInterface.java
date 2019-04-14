package edu.kis.vh.nursery.storage;

public interface IntStorageInterface {
	
	static final int EMPTY_STACK_INDEX = 0;
	
    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();


}
