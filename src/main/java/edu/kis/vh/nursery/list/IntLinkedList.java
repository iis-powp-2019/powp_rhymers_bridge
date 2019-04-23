package edu.kis.vh.nursery.list;

public class IntLinkedList implements Interface {

    private static final int EMPTY = -1;
    private int total = 0;
    private Node last;

    @Override public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
        total++;
    }

    @Override public boolean isEmpty() {
        return last == null;
    }

    @Override public boolean isFull() {
        return false;
    }

    @Override public int getTotal() {
        return total;
    }

    @Override public void setTotal(int total) {
        this.total = total;
    }

    @Override public int top() {
        if (isEmpty())
            return EMPTY;
        return last.getValue();
    }

    @Override public int pop() {
        if (isEmpty())
            return EMPTY;
        int ret = last.getValue();
        last = last.getPrev();
        total--;
        return ret;
    }
}

class Node {

    private int value;

    private Node prev, next;

    public Node(int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
