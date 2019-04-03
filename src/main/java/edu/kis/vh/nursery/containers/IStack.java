package edu.kis.vh.nursery.containers;

public interface IStack
{
	void push(int i);
	
	boolean isEmpty();
	
	boolean isFull();
	
	int top();
	
	int pop();
	
	int getTotal();
}
