package edu.kis.vh.nursery.list;

/**
* Linked list storing integers
*
* */
public class IntLinkedList implements IntStackInterface {

    private static final int EMPTY = -1;
    private Node last;
    private int i;

    /**
    * Method which allows to put value into the list
    *
    * @param i value which will be added to the list
    * */
    @Override
    public void push(int i) {
        if (getLast() == null)
            setLast(new Node(i));
        else {
            getLast().setNext(new Node(i));
            getLast().getNext().setPrev(getLast());
            setLast(getLast().getNext());
        }
    }

    /**
     * Method which allows to check if list is empty
     *
     * @return false if list contains any Nodes, otherwise true
    * */
    @Override
    public boolean isEmpty() {
        return getLast() == null;
    }

    /**
     * Method which allows to check if list is full
     *
     * @return true if list is full, otherwise false
     * */
    @Override
    public boolean isFull() {
        return false;
    }

    /**
     * Method which allows to get last element pushed to list
     *
     * @return value of the last pushed integer
     * */
    @Override
    public int top() {
        if (isEmpty())
            return EMPTY;
        return getLast().getValue();
    }

    /**
     * Method similar to top()
     * allows to get last element pushed to list and remove it from the list
     *
     * @return value of the last pushed integer
     * */
    @Override
    public int pop() {
        if (isEmpty())
            return -1;
        int ret = getLast().getValue();
        setLast(getLast().getPrev());
        return ret;
    }


    /**
     * Method allows to get last Node from the list
     *
     * @return the last Node from list
     * */
    public Node getLast() {
        return last;
    }

    /**
     * Method allows to set given Node as the last in the list
     *
     * @param last Node that will be set as the last one in the list
     * */
    public void setLast(Node last) {
        this.last = last;
    }

    @Override
    public int getTotal() {
        return i;
    }

    class Node {

        private int value;
        private Node prev;
        private Node next;

        Node(int i) {
            setValue(i);
        }

        int getValue() {
            return value;
        }

        void setValue(int value) {
            this.value = value;
        }

        Node getPrev() {
            return prev;
        }

        void setPrev(Node prev) {
            this.prev = prev;
        }

        Node getNext() {
            return next;
        }

        void setNext(Node next) {
            this.next = next;
        }
    }

}
