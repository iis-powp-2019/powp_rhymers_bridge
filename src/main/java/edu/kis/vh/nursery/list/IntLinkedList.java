package edu.kis.vh.nursery.list;

public class IntLinkedList {

    Node last;
    int i;

    private void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    private boolean isEmpty() {
        return last == null;
    }

    private boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return -1;
        return last.value;
    }

    private int pop() {
        if (isEmpty())
            return -1;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
