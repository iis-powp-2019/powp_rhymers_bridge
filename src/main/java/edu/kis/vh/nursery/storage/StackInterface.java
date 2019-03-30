package edu.kis.vh.nursery.storage;

public interface StackInterface {
	
	int EMPTY_STACK_VALUE = -1;

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

}