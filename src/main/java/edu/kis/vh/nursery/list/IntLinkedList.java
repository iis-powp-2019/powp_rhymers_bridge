package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private final int EMPTY_NODE_VALUE = -1;
    private Node last;

    public void push(int numberElement) {
        if (last == null)
            last = new Node(numberElement);
        else {
            last.next = new Node(numberElement);
            last.next.prev = last;
            last = last.next;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return EMPTY_NODE_VALUE;
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return EMPTY_NODE_VALUE;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
