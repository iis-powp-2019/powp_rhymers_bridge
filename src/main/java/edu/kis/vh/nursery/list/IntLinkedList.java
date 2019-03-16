package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.IStackInt;

/**
 * Linked Listy Int type
 */
public class IntLinkedList implements IStackInt {

    private static final int EMPTY_RETURN_CODE = -1;
    private Node lastNode;


    /**
     * @param i value to add to list.
     * Add node with value to list.
     */
    @Override
    public void countIn(int i) {
        if (lastNode == null)
            lastNode = new Node(i);
        else {
            lastNode.setNext(new Node(i));
            lastNode.getNext().setPrev(lastNode);
            lastNode = lastNode.getNext();
        }
    }

    /**
     * @return checking if lastNode is null.
     */
    @Override
    public boolean callCheck() {
        return lastNode == null;
    }

    /**
     * @return last node from list, and pop them.
     */
    @Override
    public int countOut() {
        if (callCheck())
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
        return false;
    }

    /**
     * @return if not empty, get value of last node
     */
    @Override
    public int peekaboo() {
        if (callCheck())
            return EMPTY_RETURN_CODE;
        return lastNode.getValue();
    }


}
