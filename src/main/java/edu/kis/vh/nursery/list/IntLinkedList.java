package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private Node last;
    private int i;

    protected void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    private boolean isEmpty() {
        return last == null;
    }

    private boolean isFull() {
        return false;
    }

    private int top() {
        if (isEmpty())
            return -1;
        return last.getValue();
    }

    private int pop() {
        if (isEmpty())
            return -1;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
