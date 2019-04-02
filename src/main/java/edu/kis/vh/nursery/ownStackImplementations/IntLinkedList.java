package edu.kis.vh.nursery.ownStackImplementations;

import edu.kis.vh.nursery.IIntStack;

/**
 * Linked Listy Int type
 */
public class IntLinkedList implements IIntStack {

    private static final int EMPTY_RETURN_CODE = -1;
    private Node lastNode;


    /**
     * @param i value to add to list.
     * Add node with value to list.
     */
    @Override
    public void push(int i) {
        if (lastNode == null)
            lastNode = new Node(i);
        else {
            lastNode.setNext(new Node(i));
            lastNode.getNext().setPrev(lastNode);
            lastNode = lastNode.getNext();
        }
    }

    /**
     * @return last node from list, and pop them.
     */
    @Override
    public int pop() {
        if (isFull())
            return EMPTY_RETURN_CODE;

        int ret = lastNode.getValue();
        lastNode = lastNode.getPrev();

        return ret;
    }

    /**
     * @return checking if list is full
     */
    @Override
    public boolean isFull() {
    	 return lastNode == null;
    }

    /**
     * @return if not empty, get value of last node
     */
    @Override
    public int peek() {
        if (isFull())
            return EMPTY_RETURN_CODE;
        return lastNode.getValue();
    }


}
