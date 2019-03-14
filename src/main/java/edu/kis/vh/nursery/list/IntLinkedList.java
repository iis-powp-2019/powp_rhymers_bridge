package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int EMPTY = -1;
    private Node last;
    private int i;

    private void push(int i) {
        if (last == null) {
            last = new Node(i);
        } else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    private boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    private int top() {
        if (isEmpty()) {
            return EMPTY;
        }
        return last.value;
    }

    private int pop() {
        if (isEmpty()) {
            return EMPTY;
        }
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
