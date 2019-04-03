package edu.kis.vh.nursery.list;


import edu.kis.vh.nursery.IStack;

class Node
{
	
	private int value;
	private Node prev, next;
	
	public Node(int i)
	{
		setValue(i);
	}
	
	public int getValue()
	{
		return value;
	}
	
	public void setValue(int value)
	{
		this.value = value;
	}
	
	public Node getPrev()
	{
		return prev;
	}
	
	public void setPrev(Node prev)
	{
		this.prev = prev;
	}
	
	public Node getNext()
	{
		return next;
	}
	
	public void setNext(Node next)
	{
		this.next = next;
	}
}

public class IntLinkedList
		implements IStack
{
	
	private static final int EMPTY_STACK_VALUE = -1;
	private Node last;
	int i;
	private int total = 0;
	
	@Override
	public void push(int i)
	{
		if(last == null)
			last = new Node(i);
		else
		{
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
		
		++total;
	}
	
	@Override
	public boolean isEmpty()
	{
		return last == null;
	}
	
	@Override
	public boolean isFull()
	{
		return false;
	}
	
	@Override
	public int top()
	{
		if(isEmpty())
			return EMPTY_STACK_VALUE;
		return last.getValue();
	}
	
	@Override
	public int pop()
	{
		if(isEmpty())
			return EMPTY_STACK_VALUE;
		final int ret = last.getValue();
		last = last.getPrev();
		--total;
		return ret;
	}
	
	public int getI()
	{
		return i;
	}
	
	@Override
	public int getTotal()
	{
		return total;
	}
}
