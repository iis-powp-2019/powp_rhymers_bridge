package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int EMPTY = 0;
    private int total = EMPTY;
    private Node last;
    private int i;

    public void push(int i) {
        if (last == null) {
            last = new Node(i);
        } else {
            last.setNext(new Node(i));
            last.getNext()
                .setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int getTotal() {
        return total;
    }

    public int top() {
        if (isEmpty()) {
            return EMPTY;
        }
        return last.getValue();
    }

    public int pop() {
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

    private Node getLast() {
        return last;
    }

}
