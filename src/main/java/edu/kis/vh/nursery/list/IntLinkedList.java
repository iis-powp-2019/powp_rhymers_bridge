package edu.kis.vh.nursery.list;

class Node {
    private int value;
    private Node prev, next;

    public Node(int i) {
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

    public Node getNext() {
        return next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

public class IntLinkedList implements StackableInterface {

    private Node last;
    private int i;
    private static final int EMPTY = -1;

    public static int getEMPTY() {
        return EMPTY;
    }

    /**
     * Added value to IntLikedList
     *
     * @param i this is the value that will be added to IntLikedList
     */
    @Override
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
     * Function of check if IntLikedList is empty
     *
     * @return true value if IntLikedList is empty otherwise false
     */
    @Override
    public boolean isEmpty() {
        return last == null;
    }

    @Override
    public boolean isFull() {return false; }

    /**
     * This function get a top element of IntLikedList without delete it.
     *
     * @return top element of IntLikedList
     */
    @Override
    public int top() {
        if (isEmpty())
            return getEMPTY();
        return last.getValue();
    }

    /**
     * This function get top element of IntLikedList and delete that element from IntLinkList
     *
     * @return top element of IntLikedList
     */
    @Override
    public int pop() {
        if (isEmpty())
            return getEMPTY();
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    /**
     * Get the last node  of IntLikedList
     *
     * @return last node  of IntLikedList
     */
    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public int getI() {
        return i;
    }
}
