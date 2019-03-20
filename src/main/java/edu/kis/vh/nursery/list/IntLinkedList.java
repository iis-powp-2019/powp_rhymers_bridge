package edu.kis.vh.nursery.list;

public class IntLinkedList {

    final int EMPTY_LIST_VALUE = -1;

    private int value;
    private IntLinkedList lastElement;
    private IntLinkedList prevElement;
    private IntLinkedList nextElement;

    private IntLinkedList(final int i) {
        value = i;
    }

    public IntLinkedList() {
    };


    public void push(final int valueToAdd) {
        if (lastElement == null)
            lastElement = new IntLinkedList(valueToAdd);
        else {
            lastElement.setNextElement(new IntLinkedList(valueToAdd));
            lastElement.getNextElement().setPrevElement(lastElement);
            lastElement = lastElement.getNextElement();
        }
    }

    private boolean isEmpty() {
        return lastElement == null;
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

    private int getValue() {
        return value;
    }

    private IntLinkedList getPrevElement() {
        return prevElement;
    }

    private void setPrevElement(IntLinkedList prevElement) {
        this.prevElement = prevElement;
    }

    private IntLinkedList getNextElement() {
        return nextElement;
    }

    private void setNextElement(IntLinkedList nextElement) {
        this.nextElement = nextElement;
    }

}
