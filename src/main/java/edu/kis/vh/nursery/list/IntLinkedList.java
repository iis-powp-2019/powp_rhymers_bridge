package edu.kis.vh.nursery.list;

public class IntLinkedList {

    final int EMPTY_LIST_VALUE = -1;

    Node lastElement;
    int i;

    public void push(final int valueToAdd) {
        if (lastElement == null)
            lastElement = new Node(valueToAdd);
        else {
            lastElement.setNextElement(new Node(valueToAdd));
            lastElement.getNextElement().setPrevElement(lastElement);
            lastElement = lastElement.getNextElement();
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
        return lastElement.getValue();
    }

    public int pop() {
        if (isEmpty())
            return EMPTY_LIST_VALUE;
        final int value = lastElement.getValue();
        lastElement = lastElement.getPrevElement();
        return value;
    }

}
