package edu.kis.vh.nursery.list;

 class Node {

    private int value;
    private Node prev;
    private Node next;

    Node(int i) {
        value = i;
    }

    int getValue() {
        return value;
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

    //W intelij: dzięki alt + strzałka w lewo lub prawo poruszamy się po otwartych kartach w edytorze
    //W eclipse: wracamy do ostatniego edytowanego pliku

}


public class IntLinkedList {

    private static final int EMPTY = -1;
    private Node last;
    private int i;

    public static int getEMPTY() {
        return EMPTY;
    }

    public void push(int i) {

        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return EMPTY;
        return last.getValue();
    }

    public int pop() {

        if (isEmpty())
            return EMPTY;

        int ret = last.getValue();

        last = last.getPrev();

        return ret;

    }

    public Node getLast() {
        return last;
    }

    public int getI() {
        return i;
    }
}
