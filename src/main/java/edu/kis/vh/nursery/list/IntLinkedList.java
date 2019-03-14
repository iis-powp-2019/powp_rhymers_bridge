package edu.kis.vh.nursery.list;

public class IntLinkedList {

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

    public boolean isEmpty() {
        return lastElement == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return -1;
        return lastElement.value;
    }

    public int pop() {
        if (isEmpty())
            return -1;
        int value = lastElement.value;
        lastElement = lastElement.prevElement;
        return value;
    }

}
