package edu.kis.vh.nursery.dataStructures;

import edu.kis.vh.nursery.IStackAndListSimilarities;
import edu.kis.vh.nursery.StructureValue;

public class IntLinkedList implements IStackAndListSimilarities {

    private Node last;
    private int i;



    @Override public void countIn(int i) {
        if (getLast() == null)
            setLast(new Node(i));
        else {
            getLast().setNext(new Node(i));
            getLast().getNext().setPrev(getLast());
            setLast(getLast().getNext());
        }
    }

    @Override public boolean callCheck() {
        return getLast() == null;
    }

    @Override  public boolean isFull() {
        return false;
    }

    @Override public int peekaboo() {
        if (callCheck())
            return StructureValue.getMinTotalValue();
        return getLast().getValue();
    }

    @Override public int countOut() {
        if (callCheck())
            return StructureValue.getMinTotalValue();
        int ret = getLast().getValue();
        setLast(getLast().getPrev());
        return ret;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public int getI() {
        return i;
    }
    class Node {

        private int value;
        private Node prev;
        private Node next;

        Node(int i) {
            setValue(i);
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
