package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.IStackInt;

public class IntLinkedList implements IStackInt {

    private static final int EMPTY_RETURN_CODE = -1;
    private Node lastNode;

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

    @Override
    public boolean callCheck() {
        return lastNode == null;
    }

    @Override
    public int countOut() {
        if (callCheck())
            return EMPTY_RETURN_CODE;

        int ret = lastNode.getValue();
        lastNode = lastNode.getPrev();

        return ret;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int peekaboo() {
        if (callCheck())
            return EMPTY_RETURN_CODE;
        return lastNode.getValue();
    }


}
