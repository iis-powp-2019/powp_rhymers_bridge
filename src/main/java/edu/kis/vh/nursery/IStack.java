package edu.kis.vh.nursery;

public interface IStack
{
	void push(int i);
	
	boolean isEmpty();
	
	boolean isFull();
	
	int top();
	
	int pop();
	
	int getTotal();
}
