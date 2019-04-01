package edu.kis.vh.nursery.storage;

public class IntLinkedList implements Stack {

    private Node last;
    private int i;

    @Override
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    @Override
    public boolean isEmpty() {
        return last == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int top() {
        if (isEmpty())
            return EMPTY_STACK_SIZE;
        return last.value;
    }

    @Override
    public int pop() {
        if (isEmpty())
            return EMPTY_STACK_SIZE;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
