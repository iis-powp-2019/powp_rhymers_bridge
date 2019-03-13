package edu.kis.vh.nursery.list;

/**
 * Stores integers in linked list
 */
public class IntLinkedList {

    public static final int EMPTY = -1;
    private Node last;
    private int i;

    /**
     * Puts value into the list
     * @param i value
     */
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
     * Checks if list is empty
     * @return true if empty
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Checks if list is full
     * @return
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Gets last value
     * @return
     */
    public int top() {
        if (isEmpty())
            return EMPTY;
        return last.getValue();
    }

    /**
     * Gets last value and removes it
     * @return
     */
    public int pop() {
        if (isEmpty())
            return EMPTY;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    /**
     * Gets last node
     * @return
     */
    public Node getLast() {
        return last;
    }


    public int getI() {
        return i;
    }


    /**
     * Class to store node
     */
    class Node {

        private int value;
        private Node prev;
        private Node next;

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
