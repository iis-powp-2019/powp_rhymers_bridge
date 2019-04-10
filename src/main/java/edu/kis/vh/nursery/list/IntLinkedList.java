package edu.kis.vh.nursery.list;

class Node {

    public int getValue() {
        return value;
    }

    private int value;
    private Node prev, next;

    public Node(int i) {
        value = i;
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

public class IntLinkedList implements IntStorageInterface {

    private Node last;
    public static final int STACKEMPTY = -1;
    private int size = 0;

    /**
     * Added value to IntLikedList
     *
     * @param i this is the value that will be added to IntLikedList
     */

    @Override public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            size ++;
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

    @Override public boolean isEmpty() {
        return last == null;
    }

    @Override public boolean isFull() {
        return false;
    }

    /**
     * This function get a top element of IntLikedList without delete it.
     *
     * @return top element of IntLikedList
     */
    @Override public int top() {
        if (isEmpty())
            return STACKEMPTY;
        return last.getValue();
    }

    /**
     * This function get top element of IntLikedList and delete that element from IntLinkList
     *
     * @return top element of IntLikedList
     */

    @Override public int pop() {
        if (isEmpty())
            return STACKEMPTY;
        size--;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    /**
     * Get the last node  of IntLikedList
     *
     * @return last node  of IntLikedList
     */
    @Override public Node getLast() {
        return last;
    }

    /**
     * @return
     */

    //TODO write a meaning of the class getI and getLast

    /**
     * @param last
     */

    @Override public void setLast(Node last) {
        this.last = last;
    }

    @Override public int getSize() {
        return size;
    }
}
