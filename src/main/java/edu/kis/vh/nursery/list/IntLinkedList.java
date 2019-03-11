package edu.kis.vh.nursery.list;

/**
 * This class is mainly made for creating a list that contains various nodes
 */
public class IntLinkedList {

    private Node last;
    int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * This method checks if the list is empty
     * @return true if the list is empty or false if it is not
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * This method checks if the the list full
     * @return always false
     */
    public boolean isFull() {
        return false;
    }

    /**
     * This method returns the top value
     * @return the value of the last element or -1 if the list is empty
     */
    public int top() {
        if (isEmpty())
            return -1;
        return last.getValue();
    }

    /**
     * This method delete element from the list
     * @return the value of the element that was deleted or -1 if the list is empty
     */
    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
