package edu.kis.vh.nursery.list;

public class IntLinkedList {

    final int EMPTY_LIST_VALUE = -1;

    Node lastElement;
    int i;

    public void push(int valueToAdd) {
        if (lastElement == null)
            lastElement = new Node(valueToAdd);
        else {
            lastElement.nextElement = new Node(valueToAdd);
            lastElement.nextElement.prevElement = lastElement;
            lastElement = lastElement.nextElement;
        }
    }

    private boolean isEmpty() {
        return lastElement == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return EMPTY_LIST_VALUE;
        return lastElement.value;
    }

    public int pop() {
        if (isEmpty())
            return EMPTY_LIST_VALUE;
        int value = lastElement.value;
        lastElement = lastElement.prevElement;
        return value;
    }

}
