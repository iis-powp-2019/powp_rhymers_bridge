package edu.kis.vh.nursery.stack;

public interface StackInterface {
	
	int STACK_VALUE = 0;
	int STACK_MAX_SIZE = 12;

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

	int getTotal();

}