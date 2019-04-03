package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer
{
    IntLinkedList intArrayStack;

    public DefaultCountingOutRhymer()
    {
        this.intArrayStack = new IntLinkedList();
    }

    public DefaultCountingOutRhymer(IntLinkedList intArrayStack)
    {
        this.intArrayStack = intArrayStack;
    }

    /*public int getTotal()
    {
        return intArrayStack.getTotal();
    }

    public void setTotal(int total)
    {
        intArrayStack.setTotal(total);
    }*/

    public void push(int in)
    {
        intArrayStack.push(in);
    }

    public boolean isEmpty()
    {
        return intArrayStack.isEmpty();
    }

    public boolean isFull()
    {
        return intArrayStack.isFull();
    }

    public int top()
    {
        return intArrayStack.top();
    }

    public int pop()
    {
        return intArrayStack.pop();
    }
}
