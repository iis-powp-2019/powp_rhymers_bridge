package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IIntCounter;
import edu.kis.vh.nursery.list.IntArrayStack;
import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer
{
    IIntCounter intCounter;

    public DefaultCountingOutRhymer()
    {
        this.intCounter = new IntLinkedList();
    }

    public DefaultCountingOutRhymer(IntLinkedList intCounter)
    {
        this.intCounter = intCounter;
    }

    /*public int getTotal()
    {
        return intCounter.getTotal();
    }

    public void setTotal(int total)
    {
        intCounter.setTotal(total);
    }*/

    public void push(int in)
    {
        intCounter.push(in);
    }

    public boolean isEmpty()
    {
        return intCounter.isEmpty();
    }

    public boolean isFull()
    {
        return intCounter.isFull();
    }

    public int top()
    {
        return intCounter.top();
    }

    public int pop()
    {
        return intCounter.pop();
    }
}
