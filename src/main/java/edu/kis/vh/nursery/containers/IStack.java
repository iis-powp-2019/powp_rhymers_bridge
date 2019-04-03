package edu.kis.vh.nursery.containers;

public interface IStack
{
	public static int EMPTY_STACK_VALUE = 0;
	
	void push(int i);
	
	boolean isEmpty();
	
	boolean isFull();
	
	int top();
	
	int pop();
	
	int getTotal();
}
