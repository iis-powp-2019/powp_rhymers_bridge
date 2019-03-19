package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int EMPTY = -1;
    private Node last;
    private int i;

    private void push(int i) {
        if (last == null) {
            last = new Node(i);
        } else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
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
        return last.getValue();
    }

    private int pop() {
        if (isEmpty()) {
            return EMPTY;
        }
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    private int getI() {
        return i;
    }

    private void setI(int i) {
        this.i = i;
    }

    private Node getLast() {
        return last;
    }

    private void setLast(Node last) {
        this.last = last;
    }

}
