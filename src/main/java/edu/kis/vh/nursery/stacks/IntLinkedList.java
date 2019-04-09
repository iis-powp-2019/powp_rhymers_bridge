package edu.kis.vh.nursery.stacks;

import edu.kis.vh.nursery.IntStack;

public class IntLinkedList implements IntStack {

    Node last;
    private int count=0;
    private final int EMPTY_STACK_VALUE= 0;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
        count++;
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return EMPTY_STACK_VALUE;
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return EMPTY_STACK_VALUE;
        int ret = last.value;
        last = last.prev;
        count--;
        return ret;
    }
    public int countOut(){
        return pop();
    }
    public void countIn(int i){
        push(i);
    }
    public boolean callCheck(){
        if(count  > 0)
            return false;
        return true;
    }

    @Override
    public int getTotal() {
        return count;
    }

    public int peekaboo(){
        return top();
    }


}
